package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;

import net.mcreator.slightlyvanillaadditions.item.CrystalClockItem;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

import java.util.Random;
import java.util.Map;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class SetTimeNightProcedure extends SlightlyVanillaAdditionsModElements.ModElement {
	public SetTimeNightProcedure(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 98);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure SetTimeNight!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World)
			world.getWorld().setDayTime((int) 14000);
		{
			ItemStack _ist = new ItemStack(CrystalClockItem.block, (int) (1));
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}

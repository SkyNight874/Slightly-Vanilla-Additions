package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.slightlyvanillaadditions.item.BlueBerriesItem;
import net.mcreator.slightlyvanillaadditions.block.BlueBerriesbushnofruitBlock;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

import java.util.Map;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class BlueBerriesLorsDunClickDroitSurUnBlocProcedure extends SlightlyVanillaAdditionsModElements.ModElement {
	public BlueBerriesLorsDunClickDroitSurUnBlocProcedure(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 59);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BlueBerriesLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure BlueBerriesLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure BlueBerriesLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure BlueBerriesLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure BlueBerriesLorsDunClickDroitSurUnBloc!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(BlueBerriesItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlueBerriesbushnofruitBlock.block.getDefaultState(), 3);
	}
}

package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModItems;

import java.util.Random;

public class SetTimeSunRiseProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level)
			_level.setDayTime(0);
		{
			ItemStack _ist = new ItemStack(SlightlyVanillaAdditionsModItems.CRYSTAL_CLOCK.get());
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}

package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModEntities;
import net.mcreator.slightlyvanillaadditions.entity.ShulkSoldierEntity;

import java.util.Random;

public class EndBeaconOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new ShulkSoldierEntity(SlightlyVanillaAdditionsModEntities.SHULK_SOLDIER.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextDouble(new Random(), 1, 5)), y, (z + Mth.nextDouble(new Random(), 1, 5)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new ShulkSoldierEntity(SlightlyVanillaAdditionsModEntities.SHULK_SOLDIER.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextDouble(new Random(), 1, 5)), y, (z + Mth.nextDouble(new Random(), 1, 5)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new ShulkSoldierEntity(SlightlyVanillaAdditionsModEntities.SHULK_SOLDIER.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextDouble(new Random(), 1, 5)), y, (z + Mth.nextDouble(new Random(), 1, 5)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}

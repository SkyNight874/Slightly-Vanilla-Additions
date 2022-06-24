package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class CursedEndermanOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("TPTimer") == 0) {
			{
				Entity _ent = entity;
				_ent.teleportTo((Mth.nextInt(new Random(), 1, 10) + x), y, (Mth.nextInt(new Random(), 1, 10) + z));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((Mth.nextInt(new Random(), 1, 10) + x), y, (Mth.nextInt(new Random(), 1, 10) + z),
							_ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 5, 3, 3, 3, 1);
		}
		if (entity.getPersistentData().getDouble("TPTimer") == 0) {
			entity.getPersistentData().putDouble("TPTimer", (Mth.nextInt(new Random(), 100, 300)));
		} else {
			entity.getPersistentData().putDouble("TPTimer", (entity.getPersistentData().getDouble("tagName") - 1));
		}
	}
}

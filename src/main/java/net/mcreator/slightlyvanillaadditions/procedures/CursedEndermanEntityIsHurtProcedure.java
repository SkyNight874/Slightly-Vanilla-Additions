package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CursedEndermanEntityIsHurtProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(Math.min(x, Mth.nextDouble(new Random(), 1, 10)), y, (z + Mth.nextDouble(new Random(), 1, 10)));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(Math.min(x, Mth.nextDouble(new Random(), 1, 10)), y, (z + Mth.nextDouble(new Random(), 1, 10)),
						_ent.getYRot(), _ent.getXRot());
		}
	}
}

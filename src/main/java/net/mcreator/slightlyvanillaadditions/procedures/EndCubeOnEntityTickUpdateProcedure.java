package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EndCubeOnEntityTickUpdateProcedure {
	public static void execute(double y, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (y + 2), (entity.getDeltaMovement().z())));
	}
}

package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class EndCubeOnEntityTickUpdateProcedure {
	public static void execute(double y, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (y + 2), (entity.getDeltaMovement().z())));
	}
}

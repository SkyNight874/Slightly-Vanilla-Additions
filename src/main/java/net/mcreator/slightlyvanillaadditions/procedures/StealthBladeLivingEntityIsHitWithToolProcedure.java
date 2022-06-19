package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StealthBladeLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.isShiftKeyDown()) {
			entity.hurt(DamageSource.GENERIC, 100);
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 100, 1, (false), (false)));
		}
	}
}

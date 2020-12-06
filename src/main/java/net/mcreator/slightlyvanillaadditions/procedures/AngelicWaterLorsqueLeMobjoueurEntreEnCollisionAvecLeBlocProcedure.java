package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

import java.util.Map;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class AngelicWaterLorsqueLeMobjoueurEntreEnCollisionAvecLeBlocProcedure extends SlightlyVanillaAdditionsModElements.ModElement {
	public AngelicWaterLorsqueLeMobjoueurEntreEnCollisionAvecLeBlocProcedure(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 130);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure AngelicWaterLorsqueLeMobjoueurEntreEnCollisionAvecLeBloc!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 1, (false), (false)));
	}
}


package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.EyeOfGuardianEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelEyeOfGuardian;

public class EyeOfGuardianRenderer extends MobRenderer<EyeOfGuardianEntity, ModelEyeOfGuardian<EyeOfGuardianEntity>> {
	public EyeOfGuardianRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEyeOfGuardian(context.bakeLayer(ModelEyeOfGuardian.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EyeOfGuardianEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/eyeoftheguardian.png");
	}
}

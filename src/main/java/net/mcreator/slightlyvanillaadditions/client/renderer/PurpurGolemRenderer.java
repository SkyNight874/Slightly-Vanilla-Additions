
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.PurpurGolemEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelGolemOfGuardian;

public class PurpurGolemRenderer extends MobRenderer<PurpurGolemEntity, ModelGolemOfGuardian<PurpurGolemEntity>> {
	public PurpurGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGolemOfGuardian(context.bakeLayer(ModelGolemOfGuardian.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PurpurGolemEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/iron_golem.png");
	}
}

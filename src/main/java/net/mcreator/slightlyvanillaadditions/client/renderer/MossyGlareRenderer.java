
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.MossyGlareEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelMossyGlare;

public class MossyGlareRenderer extends MobRenderer<MossyGlareEntity, ModelMossyGlare<MossyGlareEntity>> {
	public MossyGlareRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMossyGlare(context.bakeLayer(ModelMossyGlare.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MossyGlareEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/mossyglare.png");
	}
}

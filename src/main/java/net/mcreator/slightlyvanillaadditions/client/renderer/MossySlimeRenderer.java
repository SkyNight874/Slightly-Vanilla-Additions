
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.slightlyvanillaadditions.entity.MossySlimeEntity;

public class MossySlimeRenderer extends MobRenderer<MossySlimeEntity, SlimeModel<MossySlimeEntity>> {
	public MossySlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MossySlimeEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/end_slime_mossy.png");
	}
}

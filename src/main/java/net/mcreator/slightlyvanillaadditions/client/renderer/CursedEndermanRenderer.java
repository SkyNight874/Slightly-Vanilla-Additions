
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.slightlyvanillaadditions.entity.CursedEndermanEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelCursedEnderman;

public class CursedEndermanRenderer extends MobRenderer<CursedEndermanEntity, ModelCursedEnderman<CursedEndermanEntity>> {
	public CursedEndermanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCursedEnderman(context.bakeLayer(ModelCursedEnderman.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CursedEndermanEntity, ModelCursedEnderman<CursedEndermanEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("slightly_vanilla_additions:textures/enderman_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CursedEndermanEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/endermancursed.png");
	}
}

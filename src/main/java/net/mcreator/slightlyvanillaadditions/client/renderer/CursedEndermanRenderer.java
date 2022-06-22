
package net.mcreator.slightlyvanillaadditions.client.renderer;

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

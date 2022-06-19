
package net.mcreator.slightlyvanillaadditions.client.renderer;

public class EndCubeRenderer extends MobRenderer<EndCubeEntity, Modelcustom_model<EndCubeEntity>> {

	public EndCubeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(EndCubeEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/magma_cube.png");
	}

}

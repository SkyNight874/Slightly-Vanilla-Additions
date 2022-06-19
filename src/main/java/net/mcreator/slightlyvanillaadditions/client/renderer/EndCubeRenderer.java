
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.EndCubeEntity;
import net.mcreator.slightlyvanillaadditions.client.model.Modelcustom_model;

public class EndCubeRenderer extends MobRenderer<EndCubeEntity, Modelcustom_model<EndCubeEntity>> {
	public EndCubeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EndCubeEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/magma_cube.png");
	}
}


package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.ShulkEntity;
import net.mcreator.slightlyvanillaadditions.client.model.Modelcustom_model;

public class ShulkRenderer extends MobRenderer<ShulkEntity, Modelcustom_model<ShulkEntity>> {
	public ShulkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShulkEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/shulker.png");
	}
}

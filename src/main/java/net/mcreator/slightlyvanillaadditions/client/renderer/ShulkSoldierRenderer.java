
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.ShulkSoldierEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelShulkSoldier;

public class ShulkSoldierRenderer extends MobRenderer<ShulkSoldierEntity, ModelShulkSoldier<ShulkSoldierEntity>> {
	public ShulkSoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShulkSoldier(context.bakeLayer(ModelShulkSoldier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShulkSoldierEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/skeleton.png");
	}
}

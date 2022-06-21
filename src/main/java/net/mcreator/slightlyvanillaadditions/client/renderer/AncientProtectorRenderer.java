
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.slightlyvanillaadditions.entity.AncientProtectorEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelAncient_Protector;

public class AncientProtectorRenderer extends MobRenderer<AncientProtectorEntity, ModelAncient_Protector<AncientProtectorEntity>> {
	public AncientProtectorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAncient_Protector(context.bakeLayer(ModelAncient_Protector.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<AncientProtectorEntity, ModelAncient_Protector<AncientProtectorEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("slightly_vanilla_additions:textures/ancient_protectorglow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AncientProtectorEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/ancient_protector.png");
	}
}

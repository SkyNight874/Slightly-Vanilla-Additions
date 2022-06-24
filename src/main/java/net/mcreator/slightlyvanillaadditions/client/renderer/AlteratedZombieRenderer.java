
package net.mcreator.slightlyvanillaadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.slightlyvanillaadditions.entity.AlteratedZombieEntity;
import net.mcreator.slightlyvanillaadditions.client.model.ModelAlteratedZombie;

public class AlteratedZombieRenderer extends MobRenderer<AlteratedZombieEntity, ModelAlteratedZombie<AlteratedZombieEntity>> {
	public AlteratedZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAlteratedZombie(context.bakeLayer(ModelAlteratedZombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlteratedZombieEntity entity) {
		return new ResourceLocation("slightly_vanilla_additions:textures/alterated_zombie.png");
	}
}

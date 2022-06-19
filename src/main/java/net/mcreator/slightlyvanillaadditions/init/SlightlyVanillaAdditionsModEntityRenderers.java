
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.slightlyvanillaadditions.client.renderer.MossySlimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlightlyVanillaAdditionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.FIRE_PEARL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.MOSSY_SLIME.get(), MossySlimeRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.THROWING_KNIFE.get(), ThrownItemRenderer::new);
	}
}

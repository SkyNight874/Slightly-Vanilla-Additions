
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.slightlyvanillaadditions.client.renderer.ShulkSoldierRenderer;
import net.mcreator.slightlyvanillaadditions.client.renderer.ShulkRenderer;
import net.mcreator.slightlyvanillaadditions.client.renderer.PurpurGolemRenderer;
import net.mcreator.slightlyvanillaadditions.client.renderer.EyeOfGuardianRenderer;
import net.mcreator.slightlyvanillaadditions.client.renderer.CursedEndermanRenderer;
import net.mcreator.slightlyvanillaadditions.client.renderer.AncientProtectorRenderer;
import net.mcreator.slightlyvanillaadditions.client.renderer.AlteratedZombieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlightlyVanillaAdditionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.FIRE_PEARL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.SHULK.get(), ShulkRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.EYE_OF_GUARDIAN.get(), EyeOfGuardianRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.EYE_OF_GUARDIAN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.ANCIENT_PROTECTOR.get(), AncientProtectorRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.SHULK_SOLDIER.get(), ShulkSoldierRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.ALTERATED_ZOMBIE.get(), AlteratedZombieRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.PURPUR_GOLEM.get(), PurpurGolemRenderer::new);
		event.registerEntityRenderer(SlightlyVanillaAdditionsModEntities.CURSED_ENDERMAN.get(), CursedEndermanRenderer::new);
	}
}

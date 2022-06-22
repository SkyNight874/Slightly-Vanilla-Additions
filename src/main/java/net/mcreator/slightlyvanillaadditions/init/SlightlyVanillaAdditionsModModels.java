
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.slightlyvanillaadditions.client.model.Modelendcube;
import net.mcreator.slightlyvanillaadditions.client.model.Modelcustom_model;
import net.mcreator.slightlyvanillaadditions.client.model.ModelShulkSoldier;
import net.mcreator.slightlyvanillaadditions.client.model.ModelEyeOfGuardian;
import net.mcreator.slightlyvanillaadditions.client.model.ModelAncient_Protector;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SlightlyVanillaAdditionsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelAncient_Protector.LAYER_LOCATION, ModelAncient_Protector::createBodyLayer);
		event.registerLayerDefinition(ModelShulkSoldier.LAYER_LOCATION, ModelShulkSoldier::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelEyeOfGuardian.LAYER_LOCATION, ModelEyeOfGuardian::createBodyLayer);
		event.registerLayerDefinition(Modelendcube.LAYER_LOCATION, Modelendcube::createBodyLayer);
	}
}

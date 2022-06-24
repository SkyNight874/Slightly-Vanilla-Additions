
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
import net.mcreator.slightlyvanillaadditions.client.model.ModelMossyGlare;
import net.mcreator.slightlyvanillaadditions.client.model.ModelGolemOfGuardian;
import net.mcreator.slightlyvanillaadditions.client.model.ModelEyeOfGuardian;
import net.mcreator.slightlyvanillaadditions.client.model.ModelEndPhantom;
import net.mcreator.slightlyvanillaadditions.client.model.ModelCursedEnderman;
import net.mcreator.slightlyvanillaadditions.client.model.ModelAncient_Protector;
import net.mcreator.slightlyvanillaadditions.client.model.ModelAlteratedZombie;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SlightlyVanillaAdditionsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEndPhantom.LAYER_LOCATION, ModelEndPhantom::createBodyLayer);
		event.registerLayerDefinition(ModelAncient_Protector.LAYER_LOCATION, ModelAncient_Protector::createBodyLayer);
		event.registerLayerDefinition(ModelAlteratedZombie.LAYER_LOCATION, ModelAlteratedZombie::createBodyLayer);
		event.registerLayerDefinition(ModelShulkSoldier.LAYER_LOCATION, ModelShulkSoldier::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelEyeOfGuardian.LAYER_LOCATION, ModelEyeOfGuardian::createBodyLayer);
		event.registerLayerDefinition(ModelMossyGlare.LAYER_LOCATION, ModelMossyGlare::createBodyLayer);
		event.registerLayerDefinition(ModelCursedEnderman.LAYER_LOCATION, ModelCursedEnderman::createBodyLayer);
		event.registerLayerDefinition(Modelendcube.LAYER_LOCATION, Modelendcube::createBodyLayer);
		event.registerLayerDefinition(ModelGolemOfGuardian.LAYER_LOCATION, ModelGolemOfGuardian::createBodyLayer);
	}
}

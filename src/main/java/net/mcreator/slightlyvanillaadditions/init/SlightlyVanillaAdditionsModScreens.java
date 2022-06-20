
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.slightlyvanillaadditions.client.gui.WarpGUIScreen;
import net.mcreator.slightlyvanillaadditions.client.gui.DrawerGUIScreen;
import net.mcreator.slightlyvanillaadditions.client.gui.CrystalClockGUIScreen;
import net.mcreator.slightlyvanillaadditions.client.gui.BackPackScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlightlyVanillaAdditionsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SlightlyVanillaAdditionsModMenus.BACK_PACK, BackPackScreen::new);
			MenuScreens.register(SlightlyVanillaAdditionsModMenus.WARP_GUI, WarpGUIScreen::new);
			MenuScreens.register(SlightlyVanillaAdditionsModMenus.CRYSTAL_CLOCK_GUI, CrystalClockGUIScreen::new);
			MenuScreens.register(SlightlyVanillaAdditionsModMenus.DRAWER_GUI, DrawerGUIScreen::new);
		});
	}
}

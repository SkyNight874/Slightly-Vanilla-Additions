
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.slightlyvanillaadditions.world.inventory.WarpGUIMenu;
import net.mcreator.slightlyvanillaadditions.world.inventory.DrawerGUIMenu;
import net.mcreator.slightlyvanillaadditions.world.inventory.CrystalClockGUIMenu;
import net.mcreator.slightlyvanillaadditions.world.inventory.BackPackMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlyVanillaAdditionsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BackPackMenu> BACK_PACK = register("back_pack", (id, inv, extraData) -> new BackPackMenu(id, inv, extraData));
	public static final MenuType<WarpGUIMenu> WARP_GUI = register("warp_gui", (id, inv, extraData) -> new WarpGUIMenu(id, inv, extraData));
	public static final MenuType<CrystalClockGUIMenu> CRYSTAL_CLOCK_GUI = register("crystal_clock_gui",
			(id, inv, extraData) -> new CrystalClockGUIMenu(id, inv, extraData));
	public static final MenuType<DrawerGUIMenu> DRAWER_GUI = register("drawer_gui", (id, inv, extraData) -> new DrawerGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}

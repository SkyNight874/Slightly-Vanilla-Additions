
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.slightlyvanillaadditions.fluid.PoisonousFluidFluid;
import net.mcreator.slightlyvanillaadditions.fluid.AngelicWaterFluid;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

public class SlightlyVanillaAdditionsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<Fluid> POISONOUS_FLUID = REGISTRY.register("poisonous_fluid", () -> new PoisonousFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_POISONOUS_FLUID = REGISTRY.register("flowing_poisonous_fluid",
			() -> new PoisonousFluidFluid.Flowing());
	public static final RegistryObject<Fluid> ANGELIC_WATER = REGISTRY.register("angelic_water", () -> new AngelicWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ANGELIC_WATER = REGISTRY.register("flowing_angelic_water",
			() -> new AngelicWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(POISONOUS_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_POISONOUS_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ANGELIC_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ANGELIC_WATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}

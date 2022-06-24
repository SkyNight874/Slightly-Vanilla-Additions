
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.slightlyvanillaadditions.block.PolishedBluestoneWallBlock;
import net.mcreator.slightlyvanillaadditions.block.PolishedBluestoneStairsBlock;
import net.mcreator.slightlyvanillaadditions.block.PolishedBluestoneSlabBlock;
import net.mcreator.slightlyvanillaadditions.block.PolishedBluestoneBlock;
import net.mcreator.slightlyvanillaadditions.block.PoisonousFluidBlock;
import net.mcreator.slightlyvanillaadditions.block.PoisonNyliumBlock;
import net.mcreator.slightlyvanillaadditions.block.PoisonMushroomBlock;
import net.mcreator.slightlyvanillaadditions.block.PoisonFungiBlock;
import net.mcreator.slightlyvanillaadditions.block.MushroomLanternBlock;
import net.mcreator.slightlyvanillaadditions.block.MossyMushroomBlockBlock;
import net.mcreator.slightlyvanillaadditions.block.MossyFungiBlock;
import net.mcreator.slightlyvanillaadditions.block.MossBlockBlock;
import net.mcreator.slightlyvanillaadditions.block.EnderFireBlock;
import net.mcreator.slightlyvanillaadditions.block.EnderCrownBlock;
import net.mcreator.slightlyvanillaadditions.block.EndMyceliumBlock;
import net.mcreator.slightlyvanillaadditions.block.EndMossBlock;
import net.mcreator.slightlyvanillaadditions.block.EndLilyBlock;
import net.mcreator.slightlyvanillaadditions.block.EndFarlandsPortalBlock;
import net.mcreator.slightlyvanillaadditions.block.DrawerBlock;
import net.mcreator.slightlyvanillaadditions.block.DenseVineBlock;
import net.mcreator.slightlyvanillaadditions.block.CyanMossBlock;
import net.mcreator.slightlyvanillaadditions.block.CrystalPlantBlock;
import net.mcreator.slightlyvanillaadditions.block.CrystalMossBlock;
import net.mcreator.slightlyvanillaadditions.block.CrystalBlockBlock;
import net.mcreator.slightlyvanillaadditions.block.CrystalBlock;
import net.mcreator.slightlyvanillaadditions.block.CompressedCrystalBlockBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusWoodBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusStairsBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusSlabBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusPlanksBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusLogBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusLeavesBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusGrassBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusFenceGateBlock;
import net.mcreator.slightlyvanillaadditions.block.ChorusFenceBlock;
import net.mcreator.slightlyvanillaadditions.block.BurnedTreeLogBlock;
import net.mcreator.slightlyvanillaadditions.block.BubblePlantBlock;
import net.mcreator.slightlyvanillaadditions.block.BluestoneWallBlock;
import net.mcreator.slightlyvanillaadditions.block.BluestoneStairsBlock;
import net.mcreator.slightlyvanillaadditions.block.BluestoneSlabBlock;
import net.mcreator.slightlyvanillaadditions.block.BluestoneBlock;
import net.mcreator.slightlyvanillaadditions.block.AngelicWaterBlock;
import net.mcreator.slightlyvanillaadditions.block.AngelicSlimeBlockBlock;
import net.mcreator.slightlyvanillaadditions.block.AngelicGrassBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedWoodBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedStairsBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedSlabBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedPlanksBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedNyliumBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedNetherrackBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedLogBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedLeavesBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedFungiBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedFenceGateBlock;
import net.mcreator.slightlyvanillaadditions.block.AlteratedFenceBlock;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

public class SlightlyVanillaAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<Block> BLUESTONE = REGISTRY.register("bluestone", () -> new BluestoneBlock());
	public static final RegistryObject<Block> POLISHED_BLUESTONE = REGISTRY.register("polished_bluestone", () -> new PolishedBluestoneBlock());
	public static final RegistryObject<Block> BLUESTONE_SLAB = REGISTRY.register("bluestone_slab", () -> new BluestoneSlabBlock());
	public static final RegistryObject<Block> BLUESTONE_STAIRS = REGISTRY.register("bluestone_stairs", () -> new BluestoneStairsBlock());
	public static final RegistryObject<Block> BLUESTONE_WALL = REGISTRY.register("bluestone_wall", () -> new BluestoneWallBlock());
	public static final RegistryObject<Block> POLISHED_BLUESTONE_SLAB = REGISTRY.register("polished_bluestone_slab",
			() -> new PolishedBluestoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_BLUESTONE_STAIRS = REGISTRY.register("polished_bluestone_stairs",
			() -> new PolishedBluestoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_BLUESTONE_WALL = REGISTRY.register("polished_bluestone_wall",
			() -> new PolishedBluestoneWallBlock());
	public static final RegistryObject<Block> POISON_NYLIUM = REGISTRY.register("poison_nylium", () -> new PoisonNyliumBlock());
	public static final RegistryObject<Block> CHORUS_WOOD = REGISTRY.register("chorus_wood", () -> new ChorusWoodBlock());
	public static final RegistryObject<Block> CHORUS_LOG = REGISTRY.register("chorus_log", () -> new ChorusLogBlock());
	public static final RegistryObject<Block> CHORUS_PLANKS = REGISTRY.register("chorus_planks", () -> new ChorusPlanksBlock());
	public static final RegistryObject<Block> CHORUS_LEAVES = REGISTRY.register("chorus_leaves", () -> new ChorusLeavesBlock());
	public static final RegistryObject<Block> CHORUS_STAIRS = REGISTRY.register("chorus_stairs", () -> new ChorusStairsBlock());
	public static final RegistryObject<Block> CHORUS_SLAB = REGISTRY.register("chorus_slab", () -> new ChorusSlabBlock());
	public static final RegistryObject<Block> CHORUS_FENCE = REGISTRY.register("chorus_fence", () -> new ChorusFenceBlock());
	public static final RegistryObject<Block> CHORUS_FENCE_GATE = REGISTRY.register("chorus_fence_gate", () -> new ChorusFenceGateBlock());
	public static final RegistryObject<Block> CHORUS_GRASS = REGISTRY.register("chorus_grass", () -> new ChorusGrassBlock());
	public static final RegistryObject<Block> POISON_MUSHROOM = REGISTRY.register("poison_mushroom", () -> new PoisonMushroomBlock());
	public static final RegistryObject<Block> POISONOUS_FLUID = REGISTRY.register("poisonous_fluid", () -> new PoisonousFluidBlock());
	public static final RegistryObject<Block> ALTERATED_WOOD = REGISTRY.register("alterated_wood", () -> new AlteratedWoodBlock());
	public static final RegistryObject<Block> ALTERATED_LOG = REGISTRY.register("alterated_log", () -> new AlteratedLogBlock());
	public static final RegistryObject<Block> ALTERATED_PLANKS = REGISTRY.register("alterated_planks", () -> new AlteratedPlanksBlock());
	public static final RegistryObject<Block> ALTERATED_STAIRS = REGISTRY.register("alterated_stairs", () -> new AlteratedStairsBlock());
	public static final RegistryObject<Block> ALTERATED_SLAB = REGISTRY.register("alterated_slab", () -> new AlteratedSlabBlock());
	public static final RegistryObject<Block> ALTERATED_FENCE = REGISTRY.register("alterated_fence", () -> new AlteratedFenceBlock());
	public static final RegistryObject<Block> ALTERATED_FENCE_GATE = REGISTRY.register("alterated_fence_gate", () -> new AlteratedFenceGateBlock());
	public static final RegistryObject<Block> ALTERATED_LEAVES = REGISTRY.register("alterated_leaves", () -> new AlteratedLeavesBlock());
	public static final RegistryObject<Block> ALTERATED_NYLIUM = REGISTRY.register("alterated_nylium", () -> new AlteratedNyliumBlock());
	public static final RegistryObject<Block> COMPRESSED_CRYSTAL_BLOCK = REGISTRY.register("compressed_crystal_block",
			() -> new CompressedCrystalBlockBlock());
	public static final RegistryObject<Block> CRYSTAL = REGISTRY.register("crystal", () -> new CrystalBlock());
	public static final RegistryObject<Block> DRAWER = REGISTRY.register("drawer", () -> new DrawerBlock());
	public static final RegistryObject<Block> ENDER_FIRE = REGISTRY.register("ender_fire", () -> new EnderFireBlock());
	public static final RegistryObject<Block> ENDER_CROWN = REGISTRY.register("ender_crown", () -> new EnderCrownBlock());
	public static final RegistryObject<Block> BUBBLE_PLANT = REGISTRY.register("bubble_plant", () -> new BubblePlantBlock());
	public static final RegistryObject<Block> BURNED_TREE_LOG = REGISTRY.register("burned_tree_log", () -> new BurnedTreeLogBlock());
	public static final RegistryObject<Block> CRYSTAL_BLOCK = REGISTRY.register("crystal_block", () -> new CrystalBlockBlock());
	public static final RegistryObject<Block> CRYSTAL_PLANT = REGISTRY.register("crystal_plant", () -> new CrystalPlantBlock());
	public static final RegistryObject<Block> END_LILY = REGISTRY.register("end_lily", () -> new EndLilyBlock());
	public static final RegistryObject<Block> END_MYCELIUM = REGISTRY.register("end_mycelium", () -> new EndMyceliumBlock());
	public static final RegistryObject<Block> END_MOSS = REGISTRY.register("end_moss", () -> new EndMossBlock());
	public static final RegistryObject<Block> CYAN_MOSS = REGISTRY.register("cyan_moss", () -> new CyanMossBlock());
	public static final RegistryObject<Block> ANGELIC_GRASS = REGISTRY.register("angelic_grass", () -> new AngelicGrassBlock());
	public static final RegistryObject<Block> CRYSTAL_MOSS = REGISTRY.register("crystal_moss", () -> new CrystalMossBlock());
	public static final RegistryObject<Block> MOSS_BLOCK = REGISTRY.register("moss_block", () -> new MossBlockBlock());
	public static final RegistryObject<Block> MOSSY_MUSHROOM_BLOCK = REGISTRY.register("mossy_mushroom_block", () -> new MossyMushroomBlockBlock());
	public static final RegistryObject<Block> ANGELIC_SLIME_BLOCK = REGISTRY.register("angelic_slime_block", () -> new AngelicSlimeBlockBlock());
	public static final RegistryObject<Block> ANGELIC_WATER = REGISTRY.register("angelic_water", () -> new AngelicWaterBlock());
	public static final RegistryObject<Block> DENSE_VINE = REGISTRY.register("dense_vine", () -> new DenseVineBlock());
	public static final RegistryObject<Block> MUSHROOM_LANTERN = REGISTRY.register("mushroom_lantern", () -> new MushroomLanternBlock());
	public static final RegistryObject<Block> POISON_FUNGI = REGISTRY.register("poison_fungi", () -> new PoisonFungiBlock());
	public static final RegistryObject<Block> MOSSY_FUNGI = REGISTRY.register("mossy_fungi", () -> new MossyFungiBlock());
	public static final RegistryObject<Block> ALTERATED_FUNGI = REGISTRY.register("alterated_fungi", () -> new AlteratedFungiBlock());
	public static final RegistryObject<Block> END_FARLANDS_PORTAL = REGISTRY.register("end_farlands_portal", () -> new EndFarlandsPortalBlock());
	public static final RegistryObject<Block> ALTERATED_NETHERRACK = REGISTRY.register("alterated_netherrack", () -> new AlteratedNetherrackBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ChorusGrassBlock.registerRenderLayer();
			CompressedCrystalBlockBlock.registerRenderLayer();
			CrystalBlock.registerRenderLayer();
			EnderFireBlock.registerRenderLayer();
			EnderCrownBlock.registerRenderLayer();
			BubblePlantBlock.registerRenderLayer();
			CrystalPlantBlock.registerRenderLayer();
			EndLilyBlock.registerRenderLayer();
			CyanMossBlock.registerRenderLayer();
			AngelicGrassBlock.registerRenderLayer();
			CrystalMossBlock.registerRenderLayer();
			DenseVineBlock.registerRenderLayer();
			PoisonFungiBlock.registerRenderLayer();
			MossyFungiBlock.registerRenderLayer();
			AlteratedFungiBlock.registerRenderLayer();
		}
	}
}

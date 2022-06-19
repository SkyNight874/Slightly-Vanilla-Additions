
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.slightlyvanillaadditions.world.biome.SnowyHighlandsBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.PoisonSwampBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.MossyJungleBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.CrystalPlainsBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.ChorusForestBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.BurnedDesertBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.AngelicSwampBiome;
import net.mcreator.slightlyvanillaadditions.world.biome.AlteratedForestBiome;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlyVanillaAdditionsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<Biome> SNOWY_HIGHLANDS = REGISTRY.register("snowy_highlands", () -> SnowyHighlandsBiome.createBiome());
	public static final RegistryObject<Biome> CHORUS_FOREST = REGISTRY.register("chorus_forest", () -> ChorusForestBiome.createBiome());
	public static final RegistryObject<Biome> POISON_SWAMP = REGISTRY.register("poison_swamp", () -> PoisonSwampBiome.createBiome());
	public static final RegistryObject<Biome> ALTERATED_FOREST = REGISTRY.register("alterated_forest", () -> AlteratedForestBiome.createBiome());
	public static final RegistryObject<Biome> CRYSTAL_PLAINS = REGISTRY.register("crystal_plains", () -> CrystalPlainsBiome.createBiome());
	public static final RegistryObject<Biome> BURNED_DESERT = REGISTRY.register("burned_desert", () -> BurnedDesertBiome.createBiome());
	public static final RegistryObject<Biome> MOSSY_JUNGLE = REGISTRY.register("mossy_jungle", () -> MossyJungleBiome.createBiome());
	public static final RegistryObject<Biome> ANGELIC_SWAMP = REGISTRY.register("angelic_swamp", () -> AngelicSwampBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SnowyHighlandsBiome.init();
			ChorusForestBiome.init();
			PoisonSwampBiome.init();
			AlteratedForestBiome.init();
			CrystalPlainsBiome.init();
			BurnedDesertBiome.init();
			MossyJungleBiome.init();
			AngelicSwampBiome.init();
		});
	}

	@Mod.EventBusSubscriber
	public static class BiomeInjector {
		@SubscribeEvent
		public static void onServerAboutToStart(ServerAboutToStartEvent event) {
			MinecraftServer server = event.getServer();
			Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
			Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
			WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
			for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
				DimensionType dimensionType = entry.getValue().typeHolder().value();
				if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
					ChunkGenerator chunkGenerator = entry.getValue().generator();
					// Inject biomes to biome source
					if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
						List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
						parameters.add(new Pair<>(SnowyHighlandsBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, SNOWY_HIGHLANDS.getId()))));

						MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters),
								noiseSource.preset);
						chunkGenerator.biomeSource = moddedNoiseSource;
						chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
					}
					// Inject surface rules
					if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
						NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
						SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
						if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
							List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
							surfaceRules.add(1,
									preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SNOWY_HIGHLANDS.getId()),
											SlightlyVanillaAdditionsModBlocks.POWDER_SNOW.get().defaultBlockState(),
											SlightlyVanillaAdditionsModBlocks.BLUESTONE.get().defaultBlockState(),
											SlightlyVanillaAdditionsModBlocks.BLUESTONE.get().defaultBlockState()));
							NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
									noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
									noiseGeneratorSettings.noiseRouter(),
									SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
									noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
									noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(),
									noiseGeneratorSettings.useLegacyRandomSource());
							noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
						}
					}
				}

			}
		}

		private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock,
				BlockState undergroundBlock, BlockState underwaterBlock) {
			return SurfaceRules
					.ifTrue(SurfaceRules.isBiome(biomeKey),
							SurfaceRules
									.ifTrue(SurfaceRules.abovePreliminarySurface(),
											SurfaceRules.sequence(
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
															SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																	SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
															SurfaceRules.state(undergroundBlock)))));
		}
	}
}

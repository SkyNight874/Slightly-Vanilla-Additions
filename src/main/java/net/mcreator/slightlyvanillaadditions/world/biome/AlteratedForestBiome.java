
package net.mcreator.slightlyvanillaadditions.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class AlteratedForestBiome {

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("slightly_vanilla_additions:grass_alterated_forest", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));

		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NONE).temperature(0.5f).downfall(0f)
				.specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
	}

}

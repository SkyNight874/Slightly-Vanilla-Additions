
package net.mcreator.slightlyvanillaadditions.world.features.plants;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModBlocks;

import java.util.Set;
import java.util.List;

public class ChorusGrassFeature extends RandomPatchFeature {
	public static ChorusGrassFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new ChorusGrassFeature();
		CONFIGURED_FEATURE = FeatureUtils
				.register("slightly_vanilla_additions:chorus_grass", FEATURE,
						FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
								new SimpleBlockConfiguration(
										BlockStateProvider.simple(SlightlyVanillaAdditionsModBlocks.CHORUS_GRASS.get().defaultBlockState())),
								List.of(), 64));
		PLACED_FEATURE = PlacementUtils.register("slightly_vanilla_additions:chorus_grass", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("small_end_islands"),
			new ResourceLocation("slightly_vanilla_additions:chorus_forest"), new ResourceLocation("end_midlands"),
			new ResourceLocation("end_highlands"), new ResourceLocation("end_barrens"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("slightly_vanilla_additions:end_farlands")), Level.END);

	public ChorusGrassFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}

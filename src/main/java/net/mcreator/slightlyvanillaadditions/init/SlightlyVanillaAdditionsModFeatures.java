
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.slightlyvanillaadditions.world.features.plants.PoisonFungiFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.MossyFungiFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.EnderCrownFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.EndLilyFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.CyanMossFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.CrystalPlantFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.CrystalMossFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.CrystalFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.ChorusGrassFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.BubblePlantFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.AngelicGrassFeature;
import net.mcreator.slightlyvanillaadditions.world.features.plants.AlteratedFungiFeature;
import net.mcreator.slightlyvanillaadditions.world.features.lakes.AngelicWaterFeature;
import net.mcreator.slightlyvanillaadditions.world.features.PoisonMushroomStructureFeature;
import net.mcreator.slightlyvanillaadditions.world.features.MushroomLanternMoyenFeature;
import net.mcreator.slightlyvanillaadditions.world.features.MushroomLanternBigFeature;
import net.mcreator.slightlyvanillaadditions.world.features.MossyMushroomSmallFeature;
import net.mcreator.slightlyvanillaadditions.world.features.MossyMushroomBigFeature;
import net.mcreator.slightlyvanillaadditions.world.features.EndShipwreckFeature;
import net.mcreator.slightlyvanillaadditions.world.features.EndShipFeature;
import net.mcreator.slightlyvanillaadditions.world.features.EndBeaconFeature;
import net.mcreator.slightlyvanillaadditions.world.features.AlteratedTree1Feature;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class SlightlyVanillaAdditionsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SlightlyVanillaAdditionsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CHORUS_GRASS = register("chorus_grass", ChorusGrassFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ChorusGrassFeature.GENERATE_BIOMES, ChorusGrassFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POISON_MUSHROOM_STRUCTURE = register("poison_mushroom_structure",
			PoisonMushroomStructureFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					PoisonMushroomStructureFeature.GENERATE_BIOMES, PoisonMushroomStructureFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL = register("crystal", CrystalFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CrystalFeature.GENERATE_BIOMES, CrystalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENDER_CROWN = register("ender_crown", EnderCrownFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, EnderCrownFeature.GENERATE_BIOMES, EnderCrownFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUBBLE_PLANT = register("bubble_plant", BubblePlantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BubblePlantFeature.GENERATE_BIOMES, BubblePlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_PLANT = register("crystal_plant", CrystalPlantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CrystalPlantFeature.GENERATE_BIOMES, CrystalPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_LILY = register("end_lily", EndLilyFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, EndLilyFeature.GENERATE_BIOMES, EndLilyFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CYAN_MOSS = register("cyan_moss", CyanMossFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CyanMossFeature.GENERATE_BIOMES, CyanMossFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANGELIC_GRASS = register("angelic_grass", AngelicGrassFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, AngelicGrassFeature.GENERATE_BIOMES, AngelicGrassFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_MOSS = register("crystal_moss", CrystalMossFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CrystalMossFeature.GENERATE_BIOMES, CrystalMossFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MOSSY_MUSHROOM_SMALL = register("mossy_mushroom_small", MossyMushroomSmallFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MossyMushroomSmallFeature.GENERATE_BIOMES,
					MossyMushroomSmallFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MOSSY_MUSHROOM_BIG = register("mossy_mushroom_big", MossyMushroomBigFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MossyMushroomBigFeature.GENERATE_BIOMES,
					MossyMushroomBigFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANGELIC_WATER = register("angelic_water", AngelicWaterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, AngelicWaterFeature.GENERATE_BIOMES, AngelicWaterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_LANTERN_BIG = register("mushroom_lantern_big", MushroomLanternBigFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MushroomLanternBigFeature.GENERATE_BIOMES,
					MushroomLanternBigFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_LANTERN_MOYEN = register("mushroom_lantern_moyen", MushroomLanternMoyenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MushroomLanternMoyenFeature.GENERATE_BIOMES,
					MushroomLanternMoyenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POISON_FUNGI = register("poison_fungi", PoisonFungiFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PoisonFungiFeature.GENERATE_BIOMES, PoisonFungiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MOSSY_FUNGI = register("mossy_fungi", MossyFungiFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, MossyFungiFeature.GENERATE_BIOMES, MossyFungiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ALTERATED_FUNGI = register("alterated_fungi", AlteratedFungiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AlteratedFungiFeature.GENERATE_BIOMES,
					AlteratedFungiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_SHIPWRECK = register("end_shipwreck", EndShipwreckFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, EndShipwreckFeature.GENERATE_BIOMES, EndShipwreckFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_BEACON = register("end_beacon", EndBeaconFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EndBeaconFeature.GENERATE_BIOMES, EndBeaconFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_SHIP = register("end_ship", EndShipFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, EndShipFeature.GENERATE_BIOMES, EndShipFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ALTERATED_TREE_1 = register("alterated_tree_1", AlteratedTree1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AlteratedTree1Feature.GENERATE_BIOMES,
					AlteratedTree1Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}

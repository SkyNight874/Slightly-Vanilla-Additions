
package net.mcreator.slightlyvanillaadditions.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.feature.structure.OceanRuinStructure;
import net.minecraft.world.gen.feature.structure.OceanRuinConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import net.mcreator.slightlyvanillaadditions.block.PowderSnowBlock;
import net.mcreator.slightlyvanillaadditions.block.BluestoneBlock;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class SnowyHighlandsBiome extends SlightlyVanillaAdditionsModElements.ModElement {
	@ObjectHolder("slightly_vanilla_additions:snowy_highlands")
	public static final CustomBiome biome = null;
	public SnowyHighlandsBiome(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(biome, 6));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(10f).scale(0.7f).temperature(-1f).precipitation(Biome.RainType.SNOW)
					.category(Biome.Category.EXTREME_HILLS).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(PowderSnowBlock.block.getDefaultState(),
							BluestoneBlock.block.getDefaultState(), BluestoneBlock.block.getDefaultState())));
			setRegistryName("snowy_highlands");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addOres(this);
			this.addStructure(Feature.VILLAGE.withConfiguration(new VillageConfig("village/snowy/town_centers", 6)));
			this.addStructure(Feature.IGLOO.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
			this.addStructure(Feature.OCEAN_RUIN.withConfiguration(new OceanRuinConfig(OceanRuinStructure.Type.COLD, 0.3F, 0.9F)));
		}
	}
}

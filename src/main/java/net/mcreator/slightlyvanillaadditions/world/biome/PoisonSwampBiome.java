
package net.mcreator.slightlyvanillaadditions.world.biome;

import net.minecraft.block.material.Material;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class PoisonSwampBiome extends SlightlyVanillaAdditionsModElements.ModElement {

	@ObjectHolder("slightly_vanilla_additions:poison_swamp")
	public static final CustomBiome biome = null;

	public PoisonSwampBiome(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}

	static class CustomBiome extends Biome {

		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.1f).scale(0.2f).temperature(0.5f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NONE).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(PoisonousFluidItem.block.getDefaultState(),
							Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState())));

			setRegistryName("poison_swamp");

			DefaultBiomeFeatures.addStructures(this);

			this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.withConfiguration(new SeaGrassConfig(20, 0.3D))
					.withPlacement(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));

		}

	}

}


package net.mcreator.slightlyvanillaadditions.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class OuterEndBiome {

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-13421773).waterColor(-13421773).waterFogColor(-13421773)
				.skyColor(-13421773).foliageColorOverride(10387789).grassColorOverride(-13421773)
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("music.end")), 12000, 24000, true)).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER,
				new MobSpawnSettings.SpawnerData(SlightlyVanillaAdditionsModEntities.CURSED_ENDERMAN.get(), 1, 1, 1));

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).temperature(0.5f)
				.downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(SlightlyVanillaAdditionsModBiomes.OUTER_END.get())),
				BiomeDictionary.Type.END);
	}

}

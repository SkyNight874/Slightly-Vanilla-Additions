
package net.mcreator.slightlyvanillaadditions.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModEntities;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModBiomes;

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

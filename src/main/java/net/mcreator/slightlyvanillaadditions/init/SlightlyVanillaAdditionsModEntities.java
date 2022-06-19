
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.slightlyvanillaadditions.entity.MossySlimeEntity;
import net.mcreator.slightlyvanillaadditions.entity.FirePearlEntity;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlyVanillaAdditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES,
			SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<EntityType<FirePearlEntity>> FIRE_PEARL = register("projectile_fire_pearl",
			EntityType.Builder.<FirePearlEntity>of(FirePearlEntity::new, MobCategory.MISC).setCustomClientFactory(FirePearlEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MossySlimeEntity>> MOSSY_SLIME = register("mossy_slime",
			EntityType.Builder.<MossySlimeEntity>of(MossySlimeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossySlimeEntity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MossySlimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOSSY_SLIME.get(), MossySlimeEntity.createAttributes().build());
	}
}

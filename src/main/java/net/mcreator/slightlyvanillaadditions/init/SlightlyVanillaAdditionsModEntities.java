
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

import net.mcreator.slightlyvanillaadditions.entity.ShulkEntity;
import net.mcreator.slightlyvanillaadditions.entity.FirePearlEntity;
import net.mcreator.slightlyvanillaadditions.entity.EyeOfGuardianEntityProjectile;
import net.mcreator.slightlyvanillaadditions.entity.EyeOfGuardianEntity;
import net.mcreator.slightlyvanillaadditions.entity.AncientProtectorEntity;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlightlyVanillaAdditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES,
			SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<EntityType<FirePearlEntity>> FIRE_PEARL = register("projectile_fire_pearl",
			EntityType.Builder.<FirePearlEntity>of(FirePearlEntity::new, MobCategory.MISC).setCustomClientFactory(FirePearlEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShulkEntity>> SHULK = register("shulk",
			EntityType.Builder.<ShulkEntity>of(ShulkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShulkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EyeOfGuardianEntity>> EYE_OF_GUARDIAN = register("eye_of_guardian",
			EntityType.Builder.<EyeOfGuardianEntity>of(EyeOfGuardianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EyeOfGuardianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EyeOfGuardianEntityProjectile>> EYE_OF_GUARDIAN_PROJECTILE = register("projectile_eye_of_guardian",
			EntityType.Builder.<EyeOfGuardianEntityProjectile>of(EyeOfGuardianEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(EyeOfGuardianEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AncientProtectorEntity>> ANCIENT_PROTECTOR = register("ancient_protector",
			EntityType.Builder.<AncientProtectorEntity>of(AncientProtectorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AncientProtectorEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShulkEntity.init();
			EyeOfGuardianEntity.init();
			AncientProtectorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHULK.get(), ShulkEntity.createAttributes().build());
		event.put(EYE_OF_GUARDIAN.get(), EyeOfGuardianEntity.createAttributes().build());
		event.put(ANCIENT_PROTECTOR.get(), AncientProtectorEntity.createAttributes().build());
	}
}

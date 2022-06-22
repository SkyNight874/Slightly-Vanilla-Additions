
package net.mcreator.slightlyvanillaadditions.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModItems;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class EyeOfGuardianEntityProjectile extends AbstractArrow implements ItemSupplier {
	public EyeOfGuardianEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(SlightlyVanillaAdditionsModEntities.EYE_OF_GUARDIAN_PROJECTILE.get(), world);
	}

	public EyeOfGuardianEntityProjectile(EntityType<? extends EyeOfGuardianEntityProjectile> type, Level world) {
		super(type, world);
	}

	public EyeOfGuardianEntityProjectile(EntityType<? extends EyeOfGuardianEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public EyeOfGuardianEntityProjectile(EntityType<? extends EyeOfGuardianEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(SlightlyVanillaAdditionsModItems.END_CORE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(SlightlyVanillaAdditionsModItems.END_CORE.get());
	}
}

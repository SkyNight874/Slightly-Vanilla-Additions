
package net.mcreator.slightlyvanillaadditions.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CursedEndermanEntity extends Monster {

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.MONSTER)
				.add(new MobSpawnSettings.SpawnerData(SlightlyVanillaAdditionsModEntities.CURSED_ENDERMAN.get(), 1, 1, 1));
	}

	public CursedEndermanEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SlightlyVanillaAdditionsModEntities.CURSED_ENDERMAN.get(), world);
	}

	public CursedEndermanEntity(EntityType<CursedEndermanEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}

		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		CursedEndermanEntityIsHurtProcedure.execute(

		);
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CursedEndermanOnEntityTickUpdateProcedure.execute(

		);
	}

	public void aiStep() {
		super.aiStep();

		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 1; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
			double dy = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
			double dz = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
			world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
		SpawnPlacements.register(SlightlyVanillaAdditionsModEntities.CURSED_ENDERMAN.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);

		return builder;
	}

}

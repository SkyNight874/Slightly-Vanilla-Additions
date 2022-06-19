
package net.mcreator.slightlyvanillaadditions.world.dimension;

@Mod.EventBusSubscriber
public class EndFarlandsDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {

		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(Blocks.END_STONE);

			replaceableBlocks.add(SlightlyVanillaAdditionsModBlocks.POISON_NYLIUM.get());
			replaceableBlocks.add(Blocks.END_STONE);
			replaceableBlocks.add(SlightlyVanillaAdditionsModBlocks.ALTERATED_NYLIUM.get());
			replaceableBlocks.add(Blocks.END_STONE);
			replaceableBlocks.add(SlightlyVanillaAdditionsModBlocks.COMPRESSED_CRYSTAL_BLOCK.get());
			replaceableBlocks.add(Blocks.END_STONE);

			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks)
						.addAll(replaceableBlocks).build();

				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks)
						.addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color;
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}

			};

			event.enqueueWork(
					() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("slightly_vanilla_additions:end_farlands"), customEffect));
		}

	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		if (event.getTo() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("slightly_vanilla_additions:end_farlands"))) {

			EndFarlandsPlayerEntersDimensionProcedure.execute(world, x, y, z, entity);
		}
	}

}

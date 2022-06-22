package net.mcreator.slightlyvanillaadditions.world.features.treedecorators;

public class AlteratedForestTrunkDecorator extends TrunkVineDecorator {

	public static final AlteratedForestTrunkDecorator INSTANCE = new AlteratedForestTrunkDecorator();

	public static com.mojang.serialization.Codec<AlteratedForestTrunkDecorator> codec;
	public static TreeDecoratorType<?> tdt;

	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		tdt.setRegistryName("alterated_forest_tree_trunk_decorator");
		ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(LevelSimulatedReader levelReader, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos,
			List<BlockPos> listBlockPos2) {
		listBlockPos.forEach(blockpos -> {
			if (random.nextInt(3) > 0) {
				BlockPos bp = blockpos.below();
				if (Feature.isAir(levelReader, bp)) {
					biConsumer.accept(blockpos, SlightlyVanillaAdditionsModBlocks.ALTERATED_LEAVES.get().defaultBlockState());
				}
			}

		});
	}
}

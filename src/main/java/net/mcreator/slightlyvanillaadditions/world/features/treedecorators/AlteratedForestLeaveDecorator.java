package net.mcreator.slightlyvanillaadditions.world.features.treedecorators;

public class AlteratedForestLeaveDecorator extends LeaveVineDecorator {

	public static final AlteratedForestLeaveDecorator INSTANCE = new AlteratedForestLeaveDecorator();

	public static com.mojang.serialization.Codec<LeaveVineDecorator> codec;
	public static TreeDecoratorType<?> tdt;

	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		tdt.setRegistryName("alterated_forest_tree_leave_decorator");
		ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos,
			List<BlockPos> listBlockPos2) {
		listBlockPos2.forEach((blockpos) -> {
			if (random.nextInt(4) == 0) {
				BlockPos bp = blockpos.below();
				if (Feature.isAir(level, bp)) {
					addVine(level, bp, biConsumer);
				}
			}

		});
	}

	private static void addVine(LevelSimulatedReader levelReader, BlockPos blockPos, BiConsumer<BlockPos, BlockState> biConsumer) {
		biConsumer.accept(blockPos, SlightlyVanillaAdditionsModBlocks.ALTERATED_LEAVES.get().defaultBlockState());
		int i = 4;
		for (BlockPos blockpos = blockPos.below(); Feature.isAir(levelReader, blockpos) && i > 0; --i) {
			biConsumer.accept(blockpos, SlightlyVanillaAdditionsModBlocks.ALTERATED_LEAVES.get().defaultBlockState());
			blockpos = blockpos.below();
		}

	}

}

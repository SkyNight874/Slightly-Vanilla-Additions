
package net.mcreator.slightlyvanillaadditions.world.features;

public class PillarRuins3Feature extends Feature<NoneFeatureConfiguration> {

	public static PillarRuins3Feature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new PillarRuins3Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("slightly_vanilla_additions:pillar_ruins_3", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("slightly_vanilla_additions:pillar_ruins_3", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of();

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("slightly_vanilla_additions:end_farlands")));

	private StructureTemplate template = null;

	public PillarRuins3Feature() {
		super(NoneFeatureConfiguration.CODEC);

	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;

		if (template == null)
			template = context.level().getLevel().getStructureManager()
					.getOrCreate(new ResourceLocation("slightly_vanilla_additions", "pillar_ruins3"));

		if (template == null)
			return false;

		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 8980) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);

				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;

				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);

				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {

					anyPlaced = true;
				}
			}
		}

		return anyPlaced;
	}

}

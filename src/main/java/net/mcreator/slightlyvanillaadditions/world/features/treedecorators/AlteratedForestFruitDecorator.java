package net.mcreator.slightlyvanillaadditions.world.features.treedecorators;

public class AlteratedForestFruitDecorator extends CocoaDecorator {

    public static final AlteratedForestFruitDecorator INSTANCE = new AlteratedForestFruitDecorator();

    public static com.mojang.serialization.Codec<AlteratedForestFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        tdt.setRegistryName("alterated_forest_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public AlteratedForestFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}

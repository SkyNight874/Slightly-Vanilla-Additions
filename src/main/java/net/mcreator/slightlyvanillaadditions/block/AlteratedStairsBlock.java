
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraft.block.material.Material;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class AlteratedStairsBlock extends SlightlyVanillaAdditionsModElements.ModElement {

	@ObjectHolder("slightly_vanilla_additions:alterated_stairs")
	public static final Block block = null;

	public AlteratedStairsBlock(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 61);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.6000000000000005f, 2.4000000000000004f)).getDefaultState(),

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3.6000000000000005f, 2.4000000000000004f)
							.lightValue(0));

			setRegistryName("alterated_stairs");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 6;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}

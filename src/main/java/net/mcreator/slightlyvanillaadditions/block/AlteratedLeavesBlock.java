
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraft.block.material.Material;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class AlteratedLeavesBlock extends SlightlyVanillaAdditionsModElements.ModElement {

	@ObjectHolder("slightly_vanilla_additions:alterated_leaves")
	public static final Block block = null;

	public AlteratedLeavesBlock(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 60);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends LeavesBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.24f, 0.24f).lightValue(0).notSolid());

			setRegistryName("alterated_leaves");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 36;
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

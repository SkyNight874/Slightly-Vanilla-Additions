
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraft.block.material.Material;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class ChorusFenceGateBlock extends SlightlyVanillaAdditionsModElements.ModElement {

	@ObjectHolder("slightly_vanilla_additions:chorus_fence_gate")
	public static final Block block = null;

	public ChorusFenceGateBlock(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 38);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FenceGateBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).lightValue(0));

			setRegistryName("chorus_fence_gate");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
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

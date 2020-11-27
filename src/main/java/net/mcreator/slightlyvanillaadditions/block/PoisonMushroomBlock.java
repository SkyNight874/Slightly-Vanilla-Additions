
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraft.block.material.Material;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class PoisonMushroomBlock extends SlightlyVanillaAdditionsModElements.ModElement {

	@ObjectHolder("slightly_vanilla_additions:poison_mushroom")
	public static final Block block = null;

	public PoisonMushroomBlock(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 52);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.PLANTS).sound(SoundType.CLOTH).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("poison_mushroom");
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

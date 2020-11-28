
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

import java.util.List;
import java.util.Collections;

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
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.24f, 0.24f).lightValue(0).notSolid());
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

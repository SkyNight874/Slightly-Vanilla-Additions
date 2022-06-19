
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModItems;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModBlocks;

import java.util.List;
import java.util.Collections;

public class CrystalBlock extends FlowerBlock {
	public CrystalBlock() {
		super(MobEffects.SATURATION, 0,
				BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PINK).noCollission().sound(SoundType.GLASS).strength(1f, 0.5f));
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(SlightlyVanillaAdditionsModItems.CRYSTAL_GEM.get(), 3));
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(SlightlyVanillaAdditionsModBlocks.CRYSTAL.get(), renderType -> renderType == RenderType.cutout());
	}
}

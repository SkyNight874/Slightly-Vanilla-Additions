
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModBlocks;

public class CyanMossBlock extends FlowerBlock {
	public CyanMossBlock() {
		super(MobEffects.SATURATION, 0, BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).instabreak().noDrops());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(SlightlyVanillaAdditionsModBlocks.CYAN_MOSS.get(), renderType -> renderType == RenderType.cutout());
	}
}

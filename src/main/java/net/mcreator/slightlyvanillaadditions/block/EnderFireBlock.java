
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.Minecraft;

import net.mcreator.slightlyvanillaadditions.procedures.EnderFireQuandLentiteEntreEnCollisionAvecLeBlocProcedure;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModBlocks;

import java.util.Random;

public class EnderFireBlock extends FallingBlock {
	public EnderFireBlock() {
		super(BlockBehaviour.Properties.of(Material.FIRE, MaterialColor.COLOR_PURPLE).sound(SoundType.WOOL).strength(-1, 3600000).noCollission()
				.noOcclusion().isRedstoneConductor((bs, br, bp) -> false).noDrops());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}

	@Override
	public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.DANGER_FIRE;
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 4; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.5D;
			double dy = (random.nextFloat() - 0.5D) * 0.5D;
			double dz = (random.nextFloat() - 0.5D) * 0.5D;
			world.addParticle(ParticleTypes.DRAGON_BREATH, x0, y0, z0, dx, dy, dz);
		}
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		EnderFireQuandLentiteEntreEnCollisionAvecLeBlocProcedure.execute(entity);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(SlightlyVanillaAdditionsModBlocks.ENDER_FIRE.get(), renderType -> renderType == RenderType.cutout());
	}

}

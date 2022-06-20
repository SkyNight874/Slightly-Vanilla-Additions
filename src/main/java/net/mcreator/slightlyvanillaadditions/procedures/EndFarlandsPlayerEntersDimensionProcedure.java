package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class EndFarlandsPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.setRespawnPosition(_serverPlayer.level.dimension(), new BlockPos(2000, y, z), _serverPlayer.getYRot(), true, false);
		world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.END_STONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y - 1, z - 1), Blocks.END_STONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y - 1, z - 1), Blocks.END_STONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y - 1, z + 1), Blocks.END_STONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.END_STONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y - 1, z + 1), Blocks.END_STONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.END_STONE.defaultBlockState(), 3);
	}
}

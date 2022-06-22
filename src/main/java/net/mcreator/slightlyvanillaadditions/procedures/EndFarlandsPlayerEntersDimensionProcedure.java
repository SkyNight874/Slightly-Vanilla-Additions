package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class EndFarlandsPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"tp @s 2000 ~ ~");
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.END_STONE.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + 1, y - 1, z - 1), Blocks.END_STONE.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x - 1, y - 1, z - 1), Blocks.END_STONE.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + 1, y - 1, z + 1), Blocks.END_STONE.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.END_STONE.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x - 1, y - 1, z + 1), Blocks.END_STONE.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y - 1, z), Blocks.END_STONE.defaultBlockState(), 3);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 30);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 30);
	}
}

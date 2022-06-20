package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import java.util.Random;

public class EndCubeOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
					_ent.teleportTo((entity.getX() + Mth.nextDouble(new Random(), 1, 10)), (entity.getY() + Mth.nextDouble(new Random(), 1, 10)),
							(entity.getZ() + Mth.nextDouble(new Random(), 1, 10)));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX() + Mth.nextDouble(new Random(), 1, 10)),
								(entity.getY() + Mth.nextDouble(new Random(), 1, 10)), (entity.getZ() + Mth.nextDouble(new Random(), 1, 10)),
								_ent.getYRot(), _ent.getXRot());
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 100);
	}
}

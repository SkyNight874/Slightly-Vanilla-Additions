package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import java.util.Random;

public class CursedEndermanOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (2); index0++) {
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
						_ent.teleportTo((x + Mth.nextDouble(new Random(), 1, 10)), y, (z + Mth.nextDouble(new Random(), 1, 10)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextDouble(new Random(), 1, 10)), y, (z + Mth.nextDouble(new Random(), 1, 10)),
									_ent.getYRot(), _ent.getXRot());
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) Mth.nextDouble(new Random(), 300, 600));
		}
	}
}

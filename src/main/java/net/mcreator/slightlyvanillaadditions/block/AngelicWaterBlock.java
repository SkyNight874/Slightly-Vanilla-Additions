
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.slightlyvanillaadditions.procedures.AngelicWaterLorsqueLeMobjoueurEntreEnCollisionAvecLeBlocProcedure;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModFluids;

public class AngelicWaterBlock extends LiquidBlock {
	public AngelicWaterBlock() {
		super(() -> (FlowingFluid) SlightlyVanillaAdditionsModFluids.ANGELIC_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AngelicWaterLorsqueLeMobjoueurEntreEnCollisionAvecLeBlocProcedure.execute(entity);
	}
}

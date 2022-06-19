
package net.mcreator.slightlyvanillaadditions.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModFluids;

public class PoisonousFluidBlock extends LiquidBlock {
	public PoisonousFluidBlock() {
		super(() -> (FlowingFluid) SlightlyVanillaAdditionsModFluids.POISONOUS_FLUID.get(),
				BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}

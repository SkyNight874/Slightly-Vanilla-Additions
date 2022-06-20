
package net.mcreator.slightlyvanillaadditions.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModItems;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModFluids;
import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModBlocks;

public abstract class PoisonousFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SlightlyVanillaAdditionsModFluids.POISONOUS_FLUID,
			SlightlyVanillaAdditionsModFluids.FLOWING_POISONOUS_FLUID,
			FluidAttributes.builder(new ResourceLocation("slightly_vanilla_additions:blocks/stillpoisonousfluidtexture"),
					new ResourceLocation("slightly_vanilla_additions:blocks/animatedpoisonousfluidtexture"))

	).explosionResistance(100f)

			.bucket(SlightlyVanillaAdditionsModItems.POISONOUS_FLUID_BUCKET)
			.block(() -> (LiquidBlock) SlightlyVanillaAdditionsModBlocks.POISONOUS_FLUID.get());

	private PoisonousFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PoisonousFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PoisonousFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

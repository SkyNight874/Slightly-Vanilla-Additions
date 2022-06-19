
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.slightlyvanillaadditions.block.entity.DrawerBlockEntity;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

public class SlightlyVanillaAdditionsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DRAWER = register("drawer", SlightlyVanillaAdditionsModBlocks.DRAWER,
			DrawerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

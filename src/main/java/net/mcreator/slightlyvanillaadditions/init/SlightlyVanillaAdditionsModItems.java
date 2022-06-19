
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slightlyvanillaadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.slightlyvanillaadditions.item.SaphirItem;
import net.mcreator.slightlyvanillaadditions.item.PoisonousFluidItem;
import net.mcreator.slightlyvanillaadditions.item.ObsidianHammerItem;
import net.mcreator.slightlyvanillaadditions.item.FirePearlShootItem;
import net.mcreator.slightlyvanillaadditions.item.FirePearlItem;
import net.mcreator.slightlyvanillaadditions.item.EndFarlandsItem;
import net.mcreator.slightlyvanillaadditions.item.DragonSwordItem;
import net.mcreator.slightlyvanillaadditions.item.DragonShovelItem;
import net.mcreator.slightlyvanillaadditions.item.DragonScaleItem;
import net.mcreator.slightlyvanillaadditions.item.DragonPickaxeItem;
import net.mcreator.slightlyvanillaadditions.item.DragonHoeItem;
import net.mcreator.slightlyvanillaadditions.item.DragonFangItem;
import net.mcreator.slightlyvanillaadditions.item.DragonAxeItem;
import net.mcreator.slightlyvanillaadditions.item.CrystalGemItem;
import net.mcreator.slightlyvanillaadditions.item.CrystalClockItem;
import net.mcreator.slightlyvanillaadditions.item.BurnedTreePowderItem;
import net.mcreator.slightlyvanillaadditions.item.BubbleItem;
import net.mcreator.slightlyvanillaadditions.item.BackPackItemItem;
import net.mcreator.slightlyvanillaadditions.item.AngelicWaterItem;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

public class SlightlyVanillaAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlightlyVanillaAdditionsMod.MODID);
	public static final RegistryObject<Item> POWDER_SNOW = block(SlightlyVanillaAdditionsModBlocks.POWDER_SNOW, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUESTONE = block(SlightlyVanillaAdditionsModBlocks.BLUESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_BLUESTONE = block(SlightlyVanillaAdditionsModBlocks.POLISHED_BLUESTONE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUESTONE_SLAB = block(SlightlyVanillaAdditionsModBlocks.BLUESTONE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUESTONE_STAIRS = block(SlightlyVanillaAdditionsModBlocks.BLUESTONE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUESTONE_WALL = block(SlightlyVanillaAdditionsModBlocks.BLUESTONE_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_BLUESTONE_SLAB = block(SlightlyVanillaAdditionsModBlocks.POLISHED_BLUESTONE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_BLUESTONE_STAIRS = block(SlightlyVanillaAdditionsModBlocks.POLISHED_BLUESTONE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_BLUESTONE_WALL = block(SlightlyVanillaAdditionsModBlocks.POLISHED_BLUESTONE_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRAGON_FANG = REGISTRY.register("dragon_fang", () -> new DragonFangItem());
	public static final RegistryObject<Item> DRAGON_PICKAXE = REGISTRY.register("dragon_pickaxe", () -> new DragonPickaxeItem());
	public static final RegistryObject<Item> DRAGON_AXE = REGISTRY.register("dragon_axe", () -> new DragonAxeItem());
	public static final RegistryObject<Item> DRAGON_SWORD = REGISTRY.register("dragon_sword", () -> new DragonSwordItem());
	public static final RegistryObject<Item> DRAGON_SHOVEL = REGISTRY.register("dragon_shovel", () -> new DragonShovelItem());
	public static final RegistryObject<Item> DRAGON_HOE = REGISTRY.register("dragon_hoe", () -> new DragonHoeItem());
	public static final RegistryObject<Item> DRAGON_SCALE = REGISTRY.register("dragon_scale", () -> new DragonScaleItem());
	public static final RegistryObject<Item> POISON_NYLIUM = block(SlightlyVanillaAdditionsModBlocks.POISON_NYLIUM,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_WOOD = block(SlightlyVanillaAdditionsModBlocks.CHORUS_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_LOG = block(SlightlyVanillaAdditionsModBlocks.CHORUS_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_PLANKS = block(SlightlyVanillaAdditionsModBlocks.CHORUS_PLANKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_LEAVES = block(SlightlyVanillaAdditionsModBlocks.CHORUS_LEAVES,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_STAIRS = block(SlightlyVanillaAdditionsModBlocks.CHORUS_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_SLAB = block(SlightlyVanillaAdditionsModBlocks.CHORUS_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_FENCE = block(SlightlyVanillaAdditionsModBlocks.CHORUS_FENCE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_FENCE_GATE = block(SlightlyVanillaAdditionsModBlocks.CHORUS_FENCE_GATE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHORUS_GRASS = block(SlightlyVanillaAdditionsModBlocks.CHORUS_GRASS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BACK_PACK_ITEM = REGISTRY.register("back_pack_item", () -> new BackPackItemItem());
	public static final RegistryObject<Item> POISON_MUSHROOM = block(SlightlyVanillaAdditionsModBlocks.POISON_MUSHROOM,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POISONOUS_FLUID_BUCKET = REGISTRY.register("poisonous_fluid_bucket", () -> new PoisonousFluidItem());
	public static final RegistryObject<Item> OBSIDIAN_HAMMER = REGISTRY.register("obsidian_hammer", () -> new ObsidianHammerItem());
	public static final RegistryObject<Item> ALTERATED_WOOD = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_WOOD,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_LOG = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_LOG,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_PLANKS = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_PLANKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_STAIRS = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_SLAB = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_FENCE = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_FENCE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_FENCE_GATE = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_FENCE_GATE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_LEAVES = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_LEAVES,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALTERATED_NYLIUM = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_NYLIUM,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_PEARL = REGISTRY.register("fire_pearl", () -> new FirePearlItem());
	public static final RegistryObject<Item> FIRE_PEARL_SHOOT = REGISTRY.register("fire_pearl_shoot", () -> new FirePearlShootItem());
	public static final RegistryObject<Item> COMPRESSED_CRYSTAL_BLOCK = block(SlightlyVanillaAdditionsModBlocks.COMPRESSED_CRYSTAL_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL = block(SlightlyVanillaAdditionsModBlocks.CRYSTAL, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> CRYSTAL_GEM = REGISTRY.register("crystal_gem", () -> new CrystalGemItem());
	public static final RegistryObject<Item> CRYSTAL_CLOCK = REGISTRY.register("crystal_clock", () -> new CrystalClockItem());
	public static final RegistryObject<Item> DRAWER = block(SlightlyVanillaAdditionsModBlocks.DRAWER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPHIR = REGISTRY.register("saphir", () -> new SaphirItem());
	public static final RegistryObject<Item> ENDER_FIRE = block(SlightlyVanillaAdditionsModBlocks.ENDER_FIRE, null);
	public static final RegistryObject<Item> ENDER_CROWN = block(SlightlyVanillaAdditionsModBlocks.ENDER_CROWN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BUBBLE_PLANT = doubleBlock(SlightlyVanillaAdditionsModBlocks.BUBBLE_PLANT,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BURNED_TREE_POWDER = REGISTRY.register("burned_tree_powder", () -> new BurnedTreePowderItem());
	public static final RegistryObject<Item> BURNED_TREE_LOG = block(SlightlyVanillaAdditionsModBlocks.BURNED_TREE_LOG,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_BLOCK = block(SlightlyVanillaAdditionsModBlocks.CRYSTAL_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_PLANT = block(SlightlyVanillaAdditionsModBlocks.CRYSTAL_PLANT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> END_LILY = block(SlightlyVanillaAdditionsModBlocks.END_LILY, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> END_MYCELIUM = block(SlightlyVanillaAdditionsModBlocks.END_MYCELIUM,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> END_MOSS = block(SlightlyVanillaAdditionsModBlocks.END_MOSS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CYAN_MOSS = block(SlightlyVanillaAdditionsModBlocks.CYAN_MOSS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANGELIC_GRASS = block(SlightlyVanillaAdditionsModBlocks.ANGELIC_GRASS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CRYSTAL_MOSS = block(SlightlyVanillaAdditionsModBlocks.CRYSTAL_MOSS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOSS_BLOCK = block(SlightlyVanillaAdditionsModBlocks.MOSS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MOSSY_MUSHROOM_BLOCK = block(SlightlyVanillaAdditionsModBlocks.MOSSY_MUSHROOM_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANGELIC_SLIME_BLOCK = block(SlightlyVanillaAdditionsModBlocks.ANGELIC_SLIME_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANGELIC_WATER_BUCKET = REGISTRY.register("angelic_water_bucket", () -> new AngelicWaterItem());
	public static final RegistryObject<Item> DENSE_VINE = block(SlightlyVanillaAdditionsModBlocks.DENSE_VINE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MUSHROOM_LANTERN = block(SlightlyVanillaAdditionsModBlocks.MUSHROOM_LANTERN,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POISON_FUNGI = block(SlightlyVanillaAdditionsModBlocks.POISON_FUNGI, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOSSY_FUNGI = block(SlightlyVanillaAdditionsModBlocks.MOSSY_FUNGI, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ALTERATED_FUNGI = block(SlightlyVanillaAdditionsModBlocks.ALTERATED_FUNGI,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BUBBLE = REGISTRY.register("bubble", () -> new BubbleItem());
	public static final RegistryObject<Item> END_FARLANDS = REGISTRY.register("end_farlands", () -> new EndFarlandsItem());
	public static final RegistryObject<Item> END_CUBE = REGISTRY.register("end_cube_spawn_egg",
			() -> new ForgeSpawnEggItem(SlightlyVanillaAdditionsModEntities.END_CUBE, -16777216, -10092442,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

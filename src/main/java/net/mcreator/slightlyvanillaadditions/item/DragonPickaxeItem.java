
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class DragonPickaxeItem extends SlightlyVanillaAdditionsModElements.ModElement {
	@ObjectHolder("slightly_vanilla_additions:dragon_pickaxe")
	public static final Item block = null;
	public DragonPickaxeItem(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DragonFangItem.block, (int) (1)));
			}
		}, 1, -2.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("dragon_pickaxe"));
	}
}

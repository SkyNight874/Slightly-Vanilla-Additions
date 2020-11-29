
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class DragonSwordItem extends SlightlyVanillaAdditionsModElements.ModElement {
	@ObjectHolder("slightly_vanilla_additions:dragon_sword")
	public static final Item block = null;
	public DragonSwordItem(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 7f;
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
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("dragon_sword"));
	}
}

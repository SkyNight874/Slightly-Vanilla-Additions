
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModItems;

public class DragonAxeItem extends AxeItem {
	public DragonAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlightlyVanillaAdditionsModItems.DRAGON_FANG.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}


package net.mcreator.slightlyvanillaadditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModItems;

public class DragonHoeItem extends HoeItem {
	public DragonHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 0, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}

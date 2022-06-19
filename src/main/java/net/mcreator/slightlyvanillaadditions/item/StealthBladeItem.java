
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StealthBladeItem extends SwordItem {
	public StealthBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		},

				3, 0f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		StealthBladeLivingEntityIsHitWithToolProcedure.execute(

		);
		return retval;
	}

}

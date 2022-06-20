
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModFluids;

public class AngelicWaterItem extends BucketItem {
	public AngelicWaterItem() {
		super(SlightlyVanillaAdditionsModFluids.ANGELIC_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}

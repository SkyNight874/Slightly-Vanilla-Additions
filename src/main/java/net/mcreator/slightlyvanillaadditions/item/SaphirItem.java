
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.slightlyvanillaadditions.init.SlightlyVanillaAdditionsModSounds;

public class SaphirItem extends RecordItem {
	public SaphirItem() {
		super(0, SlightlyVanillaAdditionsModSounds.REGISTRY.get(new ResourceLocation("slightly_vanilla_additions:saphir_music")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}

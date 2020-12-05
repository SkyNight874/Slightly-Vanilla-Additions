
package net.mcreator.slightlyvanillaadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class SaphirItem extends SlightlyVanillaAdditionsModElements.ModElement {
	@ObjectHolder("slightly_vanilla_additions:saphir")
	public static final Item block = null;
	public SaphirItem(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SlightlyVanillaAdditionsModElements.sounds.get(new ResourceLocation("slightly_vanilla_additions:saphir_music")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("saphir");
		}
	}
}


package net.mcreator.slightlyvanillaadditions.item;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class FirePearlShootItem extends SlightlyVanillaAdditionsModElements.ModElement {

	@ObjectHolder("slightly_vanilla_additions:fire_pearl_shoot")
	public static final Item block = null;

	public FirePearlShootItem(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 80);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("fire_pearl_shoot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}

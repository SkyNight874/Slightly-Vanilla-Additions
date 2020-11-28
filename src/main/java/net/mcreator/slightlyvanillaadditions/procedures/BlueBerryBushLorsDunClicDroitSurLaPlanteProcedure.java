package net.mcreator.slightlyvanillaadditions.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.slightlyvanillaadditions.item.BlueBerriesItem;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsModElements;

import java.util.Map;

@SlightlyVanillaAdditionsModElements.ModElement.Tag
public class BlueBerryBushLorsDunClicDroitSurLaPlanteProcedure extends SlightlyVanillaAdditionsModElements.ModElement {
	public BlueBerryBushLorsDunClicDroitSurLaPlanteProcedure(SlightlyVanillaAdditionsModElements instance) {
		super(instance, 60);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BlueBerryBushLorsDunClicDroitSurLaPlante!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.SHEARS, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BlueBerriesItem.block, (int) (1));
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
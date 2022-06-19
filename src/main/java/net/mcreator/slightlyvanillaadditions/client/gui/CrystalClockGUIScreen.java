
package net.mcreator.slightlyvanillaadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.slightlyvanillaadditions.world.inventory.CrystalClockGUIMenu;
import net.mcreator.slightlyvanillaadditions.network.CrystalClockGUIButtonMessage;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CrystalClockGUIScreen extends AbstractContainerScreen<CrystalClockGUIMenu> {
	private final static HashMap<String, Object> guistate = CrystalClockGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CrystalClockGUIScreen(CrystalClockGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("slightly_vanilla_additions:textures/crystal_clock_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/crystal_clock.png"));
		this.blit(ms, this.leftPos + 33, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Crystal Clock", 58, 9, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 43, 40, 20, new TextComponent("Day"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new CrystalClockGUIButtonMessage(0, x, y, z));
				CrystalClockGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 97, 50, 20, new TextComponent("Night"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new CrystalClockGUIButtonMessage(1, x, y, z));
				CrystalClockGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 97, 55, 20, new TextComponent("Sunset"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new CrystalClockGUIButtonMessage(2, x, y, z));
				CrystalClockGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 43, 60, 20, new TextComponent("Sunrise"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new CrystalClockGUIButtonMessage(3, x, y, z));
				CrystalClockGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}

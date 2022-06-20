
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

import net.mcreator.slightlyvanillaadditions.world.inventory.WarpGUIMenu;
import net.mcreator.slightlyvanillaadditions.network.WarpGUIButtonMessage;
import net.mcreator.slightlyvanillaadditions.SlightlyVanillaAdditionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WarpGUIScreen extends AbstractContainerScreen<WarpGUIMenu> {
	private final static HashMap<String, Object> guistate = WarpGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WarpGUIScreen(WarpGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("slightly_vanilla_additions:textures/warp_gui.png");

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
		this.addRenderableWidget(new Button(this.leftPos + -63, this.topPos + -31, 115, 20, new TextComponent("Warp to the Nether"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new WarpGUIButtonMessage(0, x, y, z));
				WarpGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -63, this.topPos + 5, 100, 20, new TextComponent("Warp to the End"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new WarpGUIButtonMessage(1, x, y, z));
				WarpGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -63, this.topPos + 41, 145, 20, new TextComponent("Warp to the EndFarlands"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new WarpGUIButtonMessage(2, x, y, z));
				WarpGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -63, this.topPos + -67, 130, 20, new TextComponent("Warp to the Overworld"), e -> {
			if (true) {
				SlightlyVanillaAdditionsMod.PACKET_HANDLER.sendToServer(new WarpGUIButtonMessage(3, x, y, z));
				WarpGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}


package net.mcreator.slightlyvanillaadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.slightlyvanillaadditions.world.inventory.MossySlimeGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MossySlimeGUIScreen extends AbstractContainerScreen<MossySlimeGUIMenu> {
	private final static HashMap<String, Object> guistate = MossySlimeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MossySlimeGUIScreen(MossySlimeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 204;
		this.imageHeight = 161;
	}

	private static final ResourceLocation texture = new ResourceLocation("slightly_vanilla_additions:textures/mossy_slime_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 11, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 20, this.topPos + 4, 0, 0, 8, 8, 8, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 20, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 29, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 47, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 56, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 65, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/moss_blue_overlay.png"));
		this.blit(ms, this.leftPos + 83, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 92, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 101, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 110, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 119, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 137, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 146, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 155, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 164, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 173, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slightly_vanilla_additions:textures/aaa.png"));
		this.blit(ms, this.leftPos + 182, this.topPos + 4, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Mossy Slime Stockage", 47, 58, -12829636);
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
	}
}

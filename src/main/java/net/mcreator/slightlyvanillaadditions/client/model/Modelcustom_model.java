package net.mcreator.slightlyvanillaadditions.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("slightly_vanilla_additions", "modelcustom_model"), "main");
	public final ModelPart segment9;
	public final ModelPart segment10;
	public final ModelPart segment11;
	public final ModelPart segment12;
	public final ModelPart segment13;
	public final ModelPart segment14;
	public final ModelPart segment15;
	public final ModelPart segment16;
	public final ModelPart core2;
	public final ModelPart segment1;
	public final ModelPart segment2;
	public final ModelPart segment3;
	public final ModelPart segment4;
	public final ModelPart segment5;
	public final ModelPart segment6;
	public final ModelPart segment7;
	public final ModelPart segment8;
	public final ModelPart core;
	public final ModelPart lid;
	public final ModelPart base;

	public Modelcustom_model(ModelPart root) {
		this.segment9 = root.getChild("segment9");
		this.segment10 = root.getChild("segment10");
		this.segment11 = root.getChild("segment11");
		this.segment12 = root.getChild("segment12");
		this.segment13 = root.getChild("segment13");
		this.segment14 = root.getChild("segment14");
		this.segment15 = root.getChild("segment15");
		this.segment16 = root.getChild("segment16");
		this.core2 = root.getChild("core2");
		this.segment1 = root.getChild("segment1");
		this.segment2 = root.getChild("segment2");
		this.segment3 = root.getChild("segment3");
		this.segment4 = root.getChild("segment4");
		this.segment5 = root.getChild("segment5");
		this.segment6 = root.getChild("segment6");
		this.segment7 = root.getChild("segment7");
		this.segment8 = root.getChild("segment8");
		this.core = root.getChild("core");
		this.lid = root.getChild("lid");
		this.base = root.getChild("base");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition segment9 = partdefinition.addOrReplaceChild("segment9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment10 = partdefinition.addOrReplaceChild("segment10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment11 = partdefinition.addOrReplaceChild("segment11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment12 = partdefinition.addOrReplaceChild("segment12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment13 = partdefinition.addOrReplaceChild("segment13", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment14 = partdefinition.addOrReplaceChild("segment14", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment15 = partdefinition.addOrReplaceChild("segment15", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment16 = partdefinition.addOrReplaceChild("segment16", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition core2 = partdefinition.addOrReplaceChild("core2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment1 = partdefinition.addOrReplaceChild("segment1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 16.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment2 = partdefinition.addOrReplaceChild("segment2",
				CubeListBuilder.create().texOffs(0, 1).addBox(-4.0F, 17.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment3 = partdefinition.addOrReplaceChild("segment3",
				CubeListBuilder.create().texOffs(24, 10).addBox(-4.0F, 18.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment4 = partdefinition.addOrReplaceChild("segment4",
				CubeListBuilder.create().texOffs(24, 19).addBox(-4.0F, 19.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment5 = partdefinition.addOrReplaceChild("segment5",
				CubeListBuilder.create().texOffs(0, 4).addBox(-4.0F, 20.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment6 = partdefinition.addOrReplaceChild("segment6",
				CubeListBuilder.create().texOffs(0, 5).addBox(-4.0F, 21.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment7 = partdefinition.addOrReplaceChild("segment7",
				CubeListBuilder.create().texOffs(0, 6).addBox(-4.0F, 22.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition segment8 = partdefinition.addOrReplaceChild("segment8",
				CubeListBuilder.create().texOffs(0, 7).addBox(-4.0F, 23.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition core = partdefinition.addOrReplaceChild("core",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lid = partdefinition.addOrReplaceChild("lid", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 28).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		segment9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment14.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment15.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		core2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		core.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}

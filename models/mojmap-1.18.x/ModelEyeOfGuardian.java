// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEyeOfGuardian<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "eyeofguardian"), "main");
	private final ModelPart head;
	private final ModelPart bb_main;

	public ModelEyeOfGuardian(ModelPart root) {
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-6.0F, 0.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Adds = head.addOrReplaceChild("Adds", CubeListBuilder.create().texOffs(14, 8)
				.addBox(6.0F, -13.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
				.addBox(6.0F, -25.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
				.addBox(6.0F, -25.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8).mirror()
				.addBox(-6.0F, -11.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 8)
				.mirror().addBox(-6.0F, -12.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 8).mirror().addBox(-6.0F, -12.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(14, 8).mirror()
				.addBox(-6.0F, -11.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 8)
				.mirror().addBox(-6.0F, -13.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 1).mirror().addBox(-6.0F, -13.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 8).mirror()
				.addBox(-6.0F, -12.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 8)
				.mirror().addBox(-6.0F, -25.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 8).mirror().addBox(-6.0F, -24.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 8).mirror()
				.addBox(-6.0F, -25.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 1)
				.mirror().addBox(-6.0F, -24.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 8).mirror().addBox(-6.0F, -26.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(14, 8).mirror()
				.addBox(-6.0F, -26.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 8)
				.mirror().addBox(-6.0F, -25.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 8).addBox(6.0F, -26.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
				.addBox(6.0F, -26.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(6.0F, -25.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 1)
				.addBox(6.0F, -24.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8).addBox(6.0F,
						-24.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(15, 1)
						.addBox(6.0F, -13.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
						.addBox(6.0F, -12.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(6.0F, -11.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(6.0F, -12.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(6.0F, -11.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(6.0F, -12.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-1.0F, -25.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 2)
						.addBox(-1.0F, -25.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(-1.0F, -25.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 6)
						.addBox(-1.0F, -25.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
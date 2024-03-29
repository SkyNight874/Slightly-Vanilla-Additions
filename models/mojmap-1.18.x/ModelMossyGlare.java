// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMossyGlare<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mossyglare"), "main");
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart front_legs;
	private final ModelPart middle_legs;
	private final ModelPart back_legs;
	private final ModelPart left_antenna;
	private final ModelPart stinger;
	private final ModelPart right_antenna;
	private final ModelPart torso;

	public ModelMossyGlare(ModelPart root) {
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
		this.front_legs = root.getChild("front_legs");
		this.middle_legs = root.getChild("middle_legs");
		this.back_legs = root.getChild("back_legs");
		this.left_antenna = root.getChild("left_antenna");
		this.stinger = root.getChild("stinger");
		this.right_antenna = root.getChild("right_antenna");
		this.torso = root.getChild("torso");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(3.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.5F, 15.0F, -3.0F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create()
				.texOffs(0, 18).addBox(-12.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 15.0F, -3.0F));

		PartDefinition front_legs = partdefinition.addOrReplaceChild("front_legs", CubeListBuilder.create()
				.texOffs(28, 1).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 22.0F, -2.0F));

		PartDefinition middle_legs = partdefinition.addOrReplaceChild("middle_legs", CubeListBuilder.create()
				.texOffs(27, 3).addBox(-1.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 22.0F, 0.0F));

		PartDefinition back_legs = partdefinition.addOrReplaceChild("back_legs", CubeListBuilder.create().texOffs(27, 5)
				.addBox(-1.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 22.0F, 2.0F));

		PartDefinition left_antenna = partdefinition.addOrReplaceChild("left_antenna", CubeListBuilder.create()
				.texOffs(2, 0).addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, -5.0F));

		PartDefinition stinger = partdefinition.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(24, 7)
				.addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition right_antenna = partdefinition.addOrReplaceChild("right_antenna", CubeListBuilder.create()
				.texOffs(2, 3).addBox(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, -5.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(9, 48)
						.addBox(-5.5F, -7.0F, -6.0F, 11.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition torso_overlay = torso.addOrReplaceChild("torso_overlay", CubeListBuilder.create().texOffs(10, 17)
				.addBox(-6.5F, -13.0F, -7.0F, 13.0F, 15.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition tail_large = torso_overlay.addOrReplaceChild("tail_large", CubeListBuilder.create()
				.texOffs(0, 71).addBox(-4.5F, -3.0F, -4.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_small = tail_large.addOrReplaceChild("tail_small", CubeListBuilder.create().texOffs(36, 84)
				.addBox(-3.5F, -3.0F, -3.0F, 7.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 104);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		middle_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_antenna.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		stinger.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_antenna.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
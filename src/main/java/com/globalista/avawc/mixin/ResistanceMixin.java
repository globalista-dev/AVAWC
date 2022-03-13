package com.globalista.avawc.mixin;

import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Blocks.class)
public class ResistanceMixin {

	@ModifyConstant(method = "<clinit>",
			slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=netherite_block")),
			constant = @Constant(floatValue=1200.0F, ordinal = 0))
	private static float changeResistance(float h) {
		return 3600000.0F;
	}

}

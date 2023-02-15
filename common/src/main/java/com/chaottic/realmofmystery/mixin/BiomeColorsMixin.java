package com.chaottic.realmofmystery.mixin;

import com.chaottic.realmofmystery.common.RealmOfMysteryBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.ColorResolver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BiomeColors.class)
public final class BiomeColorsMixin {
    private static final int BIT_MASK = 0xFF;

    private static final int COLOR = 0x9A98A6;

    @Inject(method = "getAverageColor", at = @At("RETURN"), cancellable = true)
    private static void realmofmystery_getAverageColor(BlockAndTintGetter $$0, BlockPos $$1, ColorResolver $$2, CallbackInfoReturnable<Integer> cir) {
        var radius = 3;

        var color = cir.getReturnValue();

        for (var x = -radius; x < radius; x++) {
            for (var y = -radius; y < radius; y++) {
                for (var z = -radius; z < radius; z++) {
                    if (x * x + y * y + z * z < radius * radius) {
                        var blockState = $$0.getBlockState($$1.offset(x, y, z));

                        if (blockState.is(RealmOfMysteryBlocks.CRYSTAL_LOG.get()) || blockState.is(RealmOfMysteryBlocks.CRYSTAL_LEAVES.get())) {
                            var delta = 0.25F;

                            var r = (int) Mth.lerp(delta, (color >> 16) & BIT_MASK, (COLOR >> 16) & BIT_MASK);
                            var g = (int) Mth.lerp(delta, (color >> 8) & BIT_MASK, (COLOR >> 8) & BIT_MASK);
                            var b = (int) Mth.lerp(delta, color & BIT_MASK, COLOR & BIT_MASK);

                            color = ((r & BIT_MASK) << 16) | ((g & BIT_MASK) << 8) | (b & BIT_MASK);
                        }
                    }
                }
            }
        }

        cir.setReturnValue(color);
    }
}

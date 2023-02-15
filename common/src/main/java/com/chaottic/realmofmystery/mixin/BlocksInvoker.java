package com.chaottic.realmofmystery.mixin;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Blocks.class)
public interface BlocksInvoker {

    @Invoker("log")
    static RotatedPillarBlock realmofmystry_log(MaterialColor y, MaterialColor x) {
        throw new RuntimeException();
    }

    @Invoker("leaves")
    static LeavesBlock realmofmystery_leaves(SoundType soundType) {
        throw new RuntimeException();
    }
}

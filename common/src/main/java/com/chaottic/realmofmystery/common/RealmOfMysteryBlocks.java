package com.chaottic.realmofmystery.common;

import corgitaco.corgilib.reg.RegistrationProvider;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public final class RealmOfMysteryBlocks {
    public static final RegistrationProvider<Block> PROVIDER = RegistrationProvider.get(Registry.BLOCK, RealmOfMystery.MOD_ID);

    private RealmOfMysteryBlocks() {}
}

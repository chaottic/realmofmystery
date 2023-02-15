package com.chaottic.realmofmystery.common;

import com.chaottic.realmofmystery.common.block.CrystalClusterBlock;
import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RealmOfMysteryBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registry.BLOCK, RealmOfMystery.MOD_ID);

    public static final RegistryObject<Block> CRYSTAL_CLUSTER = BLOCKS.register("crystal_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRYSTAL_PLANKS = null;
    public static final RegistryObject<Block> CRYSTAL_LOG = null;
    public static final RegistryObject<Block> STRIPPED_CRYSTAL_LOG = null;
    public static final RegistryObject<Block> STRIPPED_CRYSTAL_WOOD = null;
    public static final RegistryObject<Block> CRYSTAL_WOOD = null;
    public static final RegistryObject<Block> CRYSTAL_LEAVES = null;
    public static final RegistryObject<Block> CRYSTAL_SLAB = null;
    public static final RegistryObject<Block> CRYSTAL_FENCE = null;
    public static final RegistryObject<Block> CRYSTAL_STAIRS = null;
    public static final RegistryObject<Block> CRYSTAL_BUTTON = null;
    public static final RegistryObject<Block> CRYSTAL_PRESSURE_PLATE = null;
    public static final RegistryObject<Block> CRYSTAL_DOOR = null;
    public static final RegistryObject<Block> CRYSTAL_TRAPDOOR = null;
    public static final RegistryObject<Block> CRYSTAL_FENCE_GATE = null;
    public static final RegistryObject<Block> CRYSTAL_SIGN = null;

    private RealmOfMysteryBlocks() {}

    static void classLoad() {
    }
}

package com.chaottic.realmofmystery.common;

import com.chaottic.realmofmystery.common.block.CrystalClusterBlock;
import com.chaottic.realmofmystery.mixin.BlocksInvoker;
import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

public final class RealmOfMysteryBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registry.BLOCK, RealmOfMystery.MOD_ID);

    public static final RegistryObject<Block> CRYSTAL_CLUSTER = BLOCKS.register("crystal_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRYSTAL_PLANKS = BLOCKS.register("crystal_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CRYSTAL_LOG = BLOCKS.register("crystal_log", () -> BlocksInvoker.realmofmystry_log(MaterialColor.COLOR_GRAY, MaterialColor.COLOR_GRAY));
    public static final RegistryObject<Block> STRIPPED_CRYSTAL_LOG = BLOCKS.register("stripped_crystal_log", () -> BlocksInvoker.realmofmystry_log(MaterialColor.COLOR_GRAY, MaterialColor.COLOR_GRAY));
    public static final RegistryObject<Block> STRIPPED_CRYSTAL_WOOD = BLOCKS.register("stripped_crystal_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> CRYSTAL_WOOD = BLOCKS.register("crystal_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));;
    public static final RegistryObject<Block> CRYSTAL_LEAVES = BLOCKS.register("crystal_leaves", () -> BlocksInvoker.realmofmystery_leaves(SoundType.GRASS));
    public static final RegistryObject<Block> CRYSTAL_SLAB = BLOCKS.register("crystal_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CRYSTAL_FENCE = BLOCKS.register("crystal_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CRYSTAL_STAIRS = BLOCKS.register("crystal_stairs", () -> new StairBlock(CRYSTAL_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {});
    public static final RegistryObject<Block> CRYSTAL_BUTTON = BLOCKS.register("crystal_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)) {});
    public static final RegistryObject<Block> CRYSTAL_PRESSURE_PLATE = BLOCKS.register("crystal_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)) {});
    public static final RegistryObject<Block> CRYSTAL_DOOR = BLOCKS.register("crystal_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)) {});
    public static final RegistryObject<Block> CRYSTAL_TRAPDOOR = BLOCKS.register("crystal_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)) {});
    public static final RegistryObject<Block> CRYSTAL_FENCE_GATE = BLOCKS.register("crystal_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));

    private RealmOfMysteryBlocks() {}

    static void classLoad() {
    }
}

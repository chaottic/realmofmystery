package com.chaottic.realmofmystery.common;

import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public final class RealmOfMysteryItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registry.ITEM, RealmOfMystery.MOD_ID);

    // Block-Items.
    public static final RegistryObject<Item> CRYSTAL_CLUSTER = ITEMS.register("crystal_cluster", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_CLUSTER.get(), createProperties()));

    public static final RegistryObject<Item> CRYSTAL_PLANKS = ITEMS.register("crystal_planks", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_PLANKS.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_LOG = ITEMS.register("crystal_log", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_LOG.get(), createProperties()));
    public static final RegistryObject<Item> STRIPPED_CRYSTAL_LOG = ITEMS.register("stripped_crystal_log", () -> new BlockItem(RealmOfMysteryBlocks.STRIPPED_CRYSTAL_LOG.get(), createProperties()));
    public static final RegistryObject<Item> STRIPPED_CRYSTAL_WOOD = ITEMS.register("stripped_crystal_wood", () -> new BlockItem(RealmOfMysteryBlocks.STRIPPED_CRYSTAL_WOOD.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_WOOD = ITEMS.register("crystal_wood", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_WOOD.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_LEAVES = ITEMS.register("crystal_leaves", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_LEAVES.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_SLAB = ITEMS.register("crystal_slab", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_SLAB.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_FENCE = ITEMS.register("crystal_fence", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_FENCE.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_STAIRS = ITEMS.register("crystal_stairs", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_STAIRS.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_BUTTON = ITEMS.register("crystal_button", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_BUTTON.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_PRESSURE_PLATE = ITEMS.register("crystal_pressure_plate", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_PRESSURE_PLATE.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_DOOR = ITEMS.register("crystal_door", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_DOOR.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_TRAPDOOR = ITEMS.register("crystal_trapdoor", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_TRAPDOOR.get(), createProperties()));
    public static final RegistryObject<Item> CRYSTAL_FENCE_GATE = ITEMS.register("crystal_fence_gate", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_FENCE_GATE.get(), createProperties()));

    public static final RegistryObject<Item> OAK_WAND = ITEMS.register("oak_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> SPRUCE_WAND = ITEMS.register("spruce_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> BIRCH_WAND = ITEMS.register("birch_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> JUNGLE_WAND = ITEMS.register("jungle_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> ACACIA_WAND = ITEMS.register("acacia_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> DARK_OAK_WAND = ITEMS.register("dark_oak_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> MANGROVE_WAND = ITEMS.register("mangrove_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> CRIMSON_WAND = ITEMS.register("crimson_wand", () -> new Item(createProperties()));
    public static final RegistryObject<Item> WARPED_WAND = ITEMS.register("warped_wand", () -> new Item(createProperties()));

    private RealmOfMysteryItems() {}

    static void classLoad() {
    }

    private static Item.Properties createProperties() {
        return new Item.Properties();
    }
}

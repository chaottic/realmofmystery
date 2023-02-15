package com.chaottic.realmofmystery.common;

import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public final class RealmOfMysteryItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registry.ITEM, RealmOfMystery.MOD_ID);

    // Block-Items.
    public static final RegistryObject<Item> CRYSTAL_CLUSTER = ITEMS.register("crystal_cluster", () -> new BlockItem(RealmOfMysteryBlocks.CRYSTAL_CLUSTER.get(), createProperties()));

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

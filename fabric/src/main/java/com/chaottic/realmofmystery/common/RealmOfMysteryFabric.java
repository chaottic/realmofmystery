package com.chaottic.realmofmystery.common;

import corgitaco.corgilib.CorgiLibFabric;
import net.fabricmc.api.ModInitializer;

public final class RealmOfMysteryFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CorgiLibFabric.initializeCorgiLib("Realm of mystery initializer.");

        RealmOfMysteryBlocks.classLoad();
        RealmOfMysteryItems.classLoad();
    }
}

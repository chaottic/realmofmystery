package com.chaottic.realmofmystery.common;

import com.chaottic.realmofmystery.common.world.level.structure.ROMStructurePieceTypes;
import com.chaottic.realmofmystery.common.world.level.structure.ROMStructureSets;
import com.chaottic.realmofmystery.common.world.level.structure.ROMStructureTypes;
import com.chaottic.realmofmystery.common.world.level.structure.ROMStructures;
import corgitaco.corgilib.CorgiLibFabric;
import net.fabricmc.api.ModInitializer;

public final class RealmOfMysteryFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CorgiLibFabric.initializeCorgiLib("Realm of mystery initializer.");

        RealmOfMysteryBlocks.classLoad();
        RealmOfMysteryItems.classLoad();
        ROMStructureTypes.classLoad();
        ROMStructurePieceTypes.classLoad();
        ROMStructures.classLoad();
        ROMStructureSets.classLoad();
    }
}

package com.chaottic.realmofmystery.common;


import com.chaottic.realmofmystery.common.world.level.structure.ROMStructurePieceTypes;
import com.chaottic.realmofmystery.common.world.level.structure.ROMStructureSets;
import com.chaottic.realmofmystery.common.world.level.structure.ROMStructureTypes;
import com.chaottic.realmofmystery.common.world.level.structure.ROMStructures;
import net.minecraftforge.fml.common.Mod;

@Mod(RealmOfMystery.MOD_ID)
public class RealmOfMysteryForge {

    public RealmOfMysteryForge() {
        RealmOfMysteryBlocks.classLoad();
        RealmOfMysteryItems.classLoad();

        ROMStructureTypes.classLoad();
        ROMStructurePieceTypes.classLoad();
        ROMStructures.classLoad();
        ROMStructureSets.classLoad();
    }
}
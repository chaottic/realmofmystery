package com.chaottic.realmofmystery.common.world.level.structure;


import com.chaottic.realmofmystery.common.RealmOfMystery;
import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;

import java.util.Locale;

public class ROMStructurePieceTypes {
    public static final RegistrationProvider<StructurePieceType> PROVIDER = RegistrationProvider.get(Registry.STRUCTURE_PIECE_REGISTRY, RealmOfMystery.MOD_ID);

    private static RegistryObject<StructurePieceType> setFullContextPieceId(StructurePieceType type, String id) {
        return PROVIDER.register(id.toLowerCase(Locale.ROOT), () -> type);
    }

    public static void classLoad() {
    }
}

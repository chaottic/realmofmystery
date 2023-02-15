package com.chaottic.realmofmystery.common.world.level.structure;


import com.chaottic.realmofmystery.common.RealmOfMystery;
import com.chaottic.realmofmystery.mixin.access.StructuresAccess;
import corgitaco.corgilib.reg.RegistrationProvider;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;

import java.util.Map;
import java.util.function.Supplier;

public class ROMStructures {
    public static final RegistrationProvider<Structure> PROVIDER = RegistrationProvider.get(BuiltinRegistries.STRUCTURES, RealmOfMystery.MOD_ID);


    private static Holder<Structure> register(String id, Supplier<Structure> structureSupplier) {
        return PROVIDER.register(id, structureSupplier).asHolder();
    }

    private static Structure.StructureSettings structure(TagKey<Biome> tag, TerrainAdjustment adj) {
        return StructuresAccess.structure(tag, Map.of(), GenerationStep.Decoration.SURFACE_STRUCTURES, adj);
    }

    private static Structure.StructureSettings structure(TagKey<Biome> tag, GenerationStep.Decoration decoration, TerrainAdjustment adj) {
        return StructuresAccess.structure(tag, Map.of(), decoration, adj);
    }

    public static void classLoad() {
    }

}

package com.chaottic.realmofmystery.common.world.level.structure;

import com.chaottic.realmofmystery.common.RealmOfMystery;
import corgitaco.corgilib.reg.RegistrationProvider;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;

import java.util.List;
import java.util.function.Supplier;

public class ROMStructureSets {
    public static final RegistrationProvider<StructureSet> PROVIDER = RegistrationProvider.get(BuiltinRegistries.STRUCTURE_SETS, RealmOfMystery.MOD_ID);

    public static final Holder<StructureSet> CRYSTAL_TREE = register("crystal_tree", () -> new StructureSet(List.of(), new RandomSpreadStructurePlacement(32, 8, RandomSpreadType.LINEAR, 98778678)));

    private static <T extends StructureSet> Holder<T> register(String id, Supplier<? extends T> set) {
        return PROVIDER.<T>register(id, set).asHolder();
    }

    public static void classLoad() {
    }
}

package com.chaottic.realmofmystery.common.world.level.structure;

import com.chaottic.realmofmystery.common.RealmOfMystery;
import com.mojang.serialization.Codec;
import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;

import java.util.function.Supplier;

public class ROMStructureTypes {

    public static final RegistrationProvider<StructureType<?>> PROVIDER = RegistrationProvider.get(Registry.STRUCTURE_TYPES, RealmOfMystery.MOD_ID);

    private static <S extends Structure> RegistryObject<StructureType<S>> register(String id, Supplier<? extends Codec<S>> codec) {
        return PROVIDER.register(id, () -> codec::get);
    }

    public static void classLoad() {
    }
}

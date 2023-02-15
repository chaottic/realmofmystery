package com.chaottic.realmofmystery.mixin.access;

import net.minecraft.data.worldgen.Structures;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureSpawnOverride;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(Structures.class)
public interface StructuresAccess {

    @Invoker("structure")
    static Structure.StructureSettings structure(TagKey<Biome> biomes, Map<MobCategory, StructureSpawnOverride> spawnOverrideMap, GenerationStep.Decoration decoration, TerrainAdjustment terrainAdjustment) {
        throw new Error("Mixin did not apply!");
    }

}

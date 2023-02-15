import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    id("dev.architectury.loom") version "0.12.0-SNAPSHOT"
}

loom {
    silentMojangMappingsLicense()

    runs {
        getByName("client") {
            client()
            ideConfigGenerated(true)
        }
        getByName("server") {
            server()
            ideConfigGenerated(true)
        }
    }
}

dependencies {
    minecraft("com.mojang:minecraft:1.19.2")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    forge("net.minecraftforge:forge:1.19.2-43.2.4")

    modImplementation("maven.modrinth:corgilib:1.19.2-1.0.0.22-forge")
}
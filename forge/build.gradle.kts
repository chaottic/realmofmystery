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
    val minecraft_version: String by project

    val corgilib_version: String by project
    val forge_version: String by project

    minecraft("com.mojang:minecraft:${minecraft_version}")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))
    forge("net.minecraftforge:forge:${minecraft_version}-${forge_version}")



    modImplementation("maven.modrinth:corgilib:${minecraft_version}-${corgilib_version}-forge")
}
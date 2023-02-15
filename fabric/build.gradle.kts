import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    id("fabric-loom") version "1.1-SNAPSHOT"
}

loom {
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
    val fabric_version: String by project
    val fabric_loader_version: String by project

    minecraft("com.mojang:minecraft:${minecraft_version}")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    modImplementation("net.fabricmc:fabric-loader:${fabric_loader_version}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${fabric_version}+${minecraft_version}")

    val corgilib_version: String by project

    modImplementation("maven.modrinth:corgilib:${minecraft_version}-${corgilib_version}-fabric")
}

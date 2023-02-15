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
    minecraft("com.mojang:minecraft:1.19.2")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    modImplementation("net.fabricmc:fabric-loader:0.14.11")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.68.1+1.19.3")

    modImplementation("maven.modrinth:corgilib:1.19.2-1.0.0.22-fabric")
}

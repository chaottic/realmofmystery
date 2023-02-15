plugins {
	id("org.spongepowered.gradle.vanilla") version "0.2.1-SNAPSHOT"
}

minecraft {
	version("1.19.2")
}

dependencies {
	compileOnly("maven.modrinth:corgilib:1.19.2-1.0.0.22-forge")
}

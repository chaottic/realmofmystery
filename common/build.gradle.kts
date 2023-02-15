plugins {
	id("org.spongepowered.gradle.vanilla") version "0.2.1-SNAPSHOT"
}

val minecraft_version: String by project


minecraft {
	version(minecraft_version)
}

dependencies {
	val corgilib_version: String by project
	compileOnly("maven.modrinth:corgilib:${minecraft_version}-${corgilib_version}-forge")
}

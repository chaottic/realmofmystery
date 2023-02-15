pluginManagement {
	repositories {
		gradlePluginPortal()
		mavenCentral()
		maven("https://maven.fabricmc.net/")
		maven("https://maven.architectury.dev/")
		maven("https://files.minecraftforge.net/maven/")
		maven("https://repo.spongepowered.org/repository/maven-public/")
	}
}

rootProject.name = "realmofmystery"
include("forge", "fabric", "common")

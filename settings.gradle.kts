pluginManagement {
	repositories {
		gradlePluginPortal()
		mavenCentral()
		maven("https://maven.fabricmc.net/")
		maven("https://maven.architectury.dev/")
		maven("https://files.minecraftforge.net/maven/")
	}
}

rootProject.name = "realmofmystery"
include("forge")

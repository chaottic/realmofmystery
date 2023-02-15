plugins {
    id("java")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

allprojects {
    apply(plugin = "java")

    group = "com.chaottic"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    java {
        withSourcesJar()
    }
}

subprojects {
    if (project.name != "common") {
        val common = project(":common")

        // TODO:: Remove duplicate
        sourceSets.main.get().java.srcDirs(common.sourceSets.main.get().java.srcDirs)
        sourceSets.main.get().resources.srcDirs(common.sourceSets.main.get().resources.srcDirs)

        dependencies {
            implementation(common)
        }
    }
}
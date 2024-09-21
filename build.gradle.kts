plugins {
    kotlin("jvm") version "2.0.20"
}

group = "gg.netherite"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

kotlin {
    jvmToolchain(17)
}

subprojects {
    apply(plugin = "kotlin")
}
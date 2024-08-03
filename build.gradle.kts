plugins {
    kotlin("jvm") version "1.9.23"
    id("com.utopia-rise.godot-kotlin-jvm") version "0.9.1-4.2.2"
}

group = "io.github.slimeymc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

godot {
    projectName = "godot_scene_dsl"
}

tasks.test {
    useJUnitPlatform()
}

plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    gradlePluginsLibs.apply {
        implementation(dokka.core)
        implementation(dokka.plugin)
        implementation(gradlePublish)
        implementation(kotlin.plugin)
        implementation(kotlin.serialization)
        implementation(nexus.publish)
    }
}

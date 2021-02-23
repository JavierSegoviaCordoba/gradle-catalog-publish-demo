
rootProject.name = providers.gradleProperty("libName").forUseAtConfigurationTime().get()

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":catalog-precompiled-settings-toml")

// TODO: Uncomment after run `./gradlew publishToMavenLocal`
/*
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal {
            content {
                includeGroup("com.javiersc.catalogs")
            }
        }
    }
}

plugins {
    id("com.javiersc.catalogs.precompiled-toml") version "1.0.0-SNAPSHOT"
}

include(":application")
*/

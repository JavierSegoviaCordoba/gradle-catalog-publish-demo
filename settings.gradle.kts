
rootProject.name = providers.gradleProperty("libName").forUseAtConfigurationTime().get()

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
    }
}

include(":catalog-settings")

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
    id("com.javiersc.catalogs.settings") version "1.0.0-SNAPSHOT"
}

include(":application")
 */

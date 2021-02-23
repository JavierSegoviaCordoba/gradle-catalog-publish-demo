
rootProject.name = providers.gradleProperty("libName").forUseAtConfigurationTime().get()

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":catalog-precompiled-settings")

// TODO: Uncomment after run `./gradlew publishToMavenLocal`
/*
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal {
            content {
                includeGroup("com.javiersc.catalogs")
            }
        }
        mavenLocal {
            content {
                includeGroup("com.javiersc.catalogs")
            }
        }
    }
}

plugins {
    id("com.javiersc.catalogs.precompiled") version "1.0.0-SNAPSHOT"
}

include(":application")
*/

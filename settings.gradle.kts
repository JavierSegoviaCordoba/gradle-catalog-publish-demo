
rootProject.name = providers.gradleProperty("libName").forUseAtConfigurationTime().get()

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal {
            content {
                includeGroup("com.javiersc.catalogs")
            }
        }
    }

    // TODO: Uncomment after run `./gradlew publishToMavenLocal`
/*
    versionCatalogs {
        create("versionCatalogLibs") {
            from("com.javiersc.catalogs:catalog-version:1.0.0-SNAPSHOT")
        }
    }
*/
}

include(":catalog-version")

// TODO: Uncomment after run `./gradlew publishToMavenLocal`
//include(":application")

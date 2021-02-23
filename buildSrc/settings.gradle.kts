
dependencyResolutionManagement {
    versionCatalogs {
        create("gradlePluginsLibs") { from(files("gradle-plugins.libs.versions.toml")) }
    }
}


val serialization = "1.1.0"

dependencyResolutionManagement {
    versionCatalogs {
        create("precompiledSettingsPluginLibs") {
            alias("serialization-core")
                .to("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization")

            alias("serialization-json")
                .to("org.jetbrains.kotlinx", "kotlinx-serialization-json").version(serialization)
        }
    }
}

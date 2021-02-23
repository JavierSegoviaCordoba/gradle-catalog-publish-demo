package com.javiersc.catalogs

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

open class SettingsPlugin : Plugin<Settings> {

    private val serialization = "1.1.0"

    override fun apply(settings: Settings) {
        settings.dependencyResolutionManagement {
            versionCatalogs {
                create("settingsPluginLibs") {
                    alias("serialization-core")
                        .to("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization")

                    alias("serialization-json")
                        .to("org.jetbrains.kotlinx", "kotlinx-serialization-json")
                        .version(serialization)
                }
            }
        }
    }
}

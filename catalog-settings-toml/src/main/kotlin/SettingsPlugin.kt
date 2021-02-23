package com.javiersc.catalogs

import java.io.File
import javax.inject.Inject
import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.model.ObjectFactory

abstract class SettingsPlugin : Plugin<Settings> {

    @get:Inject
    abstract val objects: ObjectFactory

    override fun apply(settings: Settings) {
        val folder = File("${settings.rootProject.projectDir}/build/catalogs")
        if (!folder.exists()) folder.mkdirs()

        val file = File(folder, "libs.versions.toml")
        if (!file.exists()) file.createNewFile()

        val tomlInputStream = javaClass.classLoader.getResourceAsStream("libs.versions.toml")!!
        tomlInputStream.reader().use { reader -> file.writeText(reader.readText()) }

        settings.dependencyResolutionManagement {
            versionCatalogs {
                create("settingsPluginTomlLibs") {
                    from(objects.fileCollection().from(file.absolutePath))
                }
            }
        }
    }
}

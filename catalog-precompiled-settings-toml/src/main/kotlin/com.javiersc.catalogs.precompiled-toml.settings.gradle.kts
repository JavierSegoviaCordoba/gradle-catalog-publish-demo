val folder = File("${settings.rootProject.projectDir}/build/catalogs")
if (!folder.exists()) folder.mkdirs()

val file = File(folder, "libs.versions.toml")
if (!file.exists()) file.createNewFile()

val tomlInputStream = javaClass.classLoader.getResourceAsStream("libs.versions.toml")!!
tomlInputStream.reader().use { reader -> file.writeText(reader.readText()) }

dependencyResolutionManagement {
    versionCatalogs {
        create("precompiledSettingsPluginTomlLibs") {
            from(files(file.absolutePath))
        }
    }
}

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    application
}

application {
    mainClass.set("com.javiersc.catalogs.application.MainKt")
}

dependencies {
    implementation(versionCatalogTomlLibs.serialization.json)
}

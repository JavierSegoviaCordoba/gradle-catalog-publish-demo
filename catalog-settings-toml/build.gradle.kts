plugins {
    `common-config`
    `kotlin-dsl`
    `maven-publish-config`
    `gradle-publish-config`
}

dependencies {
    implementation(gradleApi())
}

pluginBundle {
    website = "https://github.com/JavierSegoviaCordoba/gradle-catalog-demo"
    vcsUrl = "https://github.com/JavierSegoviaCordoba/gradle-catalog-demo"
    tags = listOf(
        "kotlin-dsl",
        "toml",
        "precompiled plugin",
        "version catalog",
        "dependencies",
        "libraries",
        "versions",
        "demo",
    )
}

gradlePlugin {
    plugins {
        create("settingsPlugin") {
            id = "com.javiersc.catalogs.settings-toml"
            displayName = "Settings plugin which include a Version Catalog"
            description = "A demo to show how to create and publish a Settings settings plugin"
            implementationClass = "com.javiersc.catalogs.SettingsPlugin"
        }
    }
}

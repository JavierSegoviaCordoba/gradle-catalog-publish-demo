plugins {
    `common-config`
    `kotlin-dsl`
    `maven-publish-config`
    `gradle-publish-config`
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
        named("com.javiersc.catalogs.precompiled") {
            id = "com.javiersc.catalogs.precompiled"
            displayName = "Precompiled plugin which include a Version Catalog"
            description = "A demo to show how to create and publish a Precompiled settings plugin"
        }
    }
}

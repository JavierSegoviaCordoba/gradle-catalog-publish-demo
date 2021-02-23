
plugins {
    id("com.gradle.plugin-publish")
}

pluginBundle {
    website = property("pomSMCurl").toString()
    vcsUrl = property("pomSMCconnection").toString()
    tags = listOf(
        "versions",
        "catalog",
        "versions catalog",
        "plugin",
        "precompiled plugin",
    )
}

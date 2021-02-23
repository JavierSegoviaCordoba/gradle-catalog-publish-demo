plugins {
    `common-config`
    `version-catalog`
    `maven-publish-config`
}

val serialization = "1.1.0"

catalog {
    versionCatalog {
        alias("serialization-core")
            .to("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization")

        alias("serialization-json")
            .to("org.jetbrains.kotlinx", "kotlinx-serialization-json").version(serialization)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}

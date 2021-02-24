plugins {
    `common-config`
    `version-catalog`
    `maven-publish-config`
}

val serialization = "1.1.0"

catalog {
    versionCatalog {
        from(files("$projectDir/libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}

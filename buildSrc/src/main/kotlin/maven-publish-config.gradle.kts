
plugins {
    `maven-publish`
    signing
    id("docs-config")
}

val dokkaJar by tasks.creating(Jar::class) {
    archiveClassifier.set("javadoc")
    dependsOn(tasks.dokkaHtml)
}

publishing {
    publications.withType<MavenPublication>().all {
        pom {
            name.set(property("pomName").toString())
            description.set(property("pomDescription").toString())
            url.set(property("pomUrl").toString())

            licenses {
                license {
                    name.set(property("pomLicenseName").toString())
                    url.set(property("pomLicenseUrl").toString())
                }
            }

            developers {
                developer {
                    id.set(property("pomDeveloperId").toString())
                    name.set(property("pomDeveloperName").toString())
                    email.set(property("pomDeveloperEmail").toString())
                }
            }

            scm {
                url.set(property("pomSMCurl").toString())
                connection.set(property("pomSMCconnection").toString())
                developerConnection.set(property("pomSMCdeveloperConnection").toString())
            }
        }
    }
}

signing {
    if (!project.version.toString().endsWith("-SNAPSHOT")) {
        useGpgCmd()
        sign(publishing.publications)
    }
}

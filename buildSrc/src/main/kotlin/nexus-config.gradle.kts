plugins {
    id("io.github.gradle-nexus.publish-plugin")
}

nexusPublishing {
    repositories {
        sonatype {
            username.set("${property("oss.user") ?: System.getenv("ossUser")}")
            password.set("${property("oss.token") ?: System.getenv("ossToken")}")
            stagingProfileId.set(
                "${property("oss.stagingProfileId") ?: System.getenv("ossStagingProfileId")}",
            )
        }
    }
}

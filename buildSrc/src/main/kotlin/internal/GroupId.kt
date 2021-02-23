package internal

import org.gradle.api.Project

val Project.groupId: String
    get() = "${property("libGroup")}.${property("libName")}"

val Project.libVersion: String
    get() = property("libVersion")?.toString() ?: error("libVersion not indicated")

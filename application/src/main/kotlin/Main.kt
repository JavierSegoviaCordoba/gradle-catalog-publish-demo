package com.javiersc.catalogs.application

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main() {
    val json: String = """
        {
            "id": 1,
            "name": "Javi"
        }
    """.trimIndent()

    val user = Json.decodeFromString<User>(json)

    println("################################################")
    println("The user with the id: ${user.id} is ${user.name}")
    println("################################################")
}

@Serializable
data class User(val id: Int, val name: String)

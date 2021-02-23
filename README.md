# Gradle Versions Catalog demo

This project is a showcase of different ways to create and publish a version catalog.

## Structure

The main branch is almost empty, but you have to check the next branches:

- version-catalog: Create and publish a version catalog with Kotlin DSL to a maven repository
- version-catalog-toml: Same above but with TOML files
- settings-plugin: Create and publish a Gradle settings plugin that includes a catalog with Kotlin
  DSL to a maven repository or Gradle Plugin Portal
- settings-plugin-toml: Same above but with TOML files
- precompiled-settings-plugin: Create and publish a precompiled Gradle settings plugin which include
  a catalog with Kotlin DSL to a maven repository or Gradle Plugin Portal
- precompiled-settings-plugin-toml: Same above but with TOML files

When you check out a branch, you have to check the `settings.gradle.kts` file, which indicates how
you can publish the catalog to maven local.

To test if the catalog is working after publishing it, you can just `./gradlew run`

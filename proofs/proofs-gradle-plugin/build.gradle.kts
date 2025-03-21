plugins {
  id(libs.plugins.kotlin.jvm.get().pluginId)
  `java-gradle-plugin`
  alias(libs.plugins.arrowGradleConfig.kotlin)
  alias(libs.plugins.arrowGradleConfig.publish)
  alias(libs.plugins.arrowGradleConfig.versioning)
}

tasks.processResources {
  duplicatesStrategy = DuplicatesStrategy.WARN
  filesMatching("**/proofs.plugin.properties") {
    filter { it.replace("%proofsPluginVersion%", "$version") }
    filter { it.replace("%metaVersion%", projects.arrowMetaPrelude.version.toString()) }
  }
}

gradlePlugin {
  plugins {
    create("arrow") {
      id = "io.arrow-kt.proofs"
      displayName = "Arrow Proofs Gradle Plugin"
      implementationClass = "arrow.meta.plugin.gradle.ProofsGradlePlugin"
    }
  }
}

dependencies {
  api(libs.arrowGradlePluginCommons)
  runtimeOnly(libs.classgraph)

  // Necessary during plugin execution to be found and added for compilation
  api(libs.arrowMeta)
  api(projects.arrowProofsPlugin)
}

pluginBundle {
  website = "https://arrow-kt.io/docs/meta"
  vcsUrl = "https://github.com/arrow-kt/arrow-meta"
  description = "Functional companion to Kotlin's Compiler"
  tags = listOf("kotlin", "compiler", "arrow", "plugin", "meta")
}

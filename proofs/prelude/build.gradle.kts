@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  id(libs.plugins.kotlin.multiplatform.get().pluginId)
  alias(libs.plugins.arrowGradleConfig.kotlin)
  alias(libs.plugins.arrowGradleConfig.publish)
  alias(libs.plugins.arrowGradleConfig.versioning)
}

kotlin {
  explicitApi = null

  sourceSets {
    commonMain {
      dependencies {
        implementation(libs.kotlin.stdlibCommon)
      }
    }

    named("jvmMain") {
      dependencies {
        implementation(libs.kotlin.stdlibJDK8)
      }
    }

    named("jsMain") {
      dependencies {
        implementation(libs.kotlin.stdlibJS)
      }
    }
  }
}

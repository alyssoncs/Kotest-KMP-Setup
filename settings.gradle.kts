pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "kotest-kpm-setup"
include(":jvm-on-junit-platform")
include(":jvm-on-kotest")

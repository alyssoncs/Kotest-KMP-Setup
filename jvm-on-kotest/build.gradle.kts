import com.android.build.api.dsl.androidLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.kotest)
    alias(libs.plugins.ksp)
}

kotlin {
    jvm {
        testRuns.all {
            executionTask {
                failOnNoDiscoveredTests = false
            }
        }
    }
    androidLibrary {
        namespace = "com.alysson.jvm-on-kotest.template"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        withHostTest { }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    linuxX64()

    sourceSets {
        commonTest {
            dependencies {
                implementation(libs.kotest.engine)
                implementation(libs.kotest.assertions)
            }
        }

        getByName("androidHostTest") {
            dependencies {
                implementation(libs.kotest.junit.runner)
            }
        }
    }
}

tasks.withType<Test>().configureEach {
    if (name == "testAndroidHostTest") {
        useJUnitPlatform()
    }
}

tasks.named("allTests") {
    dependsOn("jvmKotest")
}

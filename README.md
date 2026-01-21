# Kotest on Kotlin Multiplatform (KMP) — template

This repo is a **Kotlin Multiplatform (KMP)** template focused on **setting up Kotest** in a multiplatform library. Original blog post [here](https://alyssoncirilo.com/blog/kotest-kmp-setup)

It includes a minimal, working test setup across typical KMP source sets (for example: `commonTest`, `iosTest`, `jvmTest`, `androidHostTest`) so you can copy the configuration into your own project.

Attribution: based on the Kotlin Multiplatform Library Template: https://github.com/Kotlin/multiplatform-library-template

The [`kotest-tests/`](./kotest-tests) module contains all the setup for running Kotest tests on multiple platforms.

Relevant build file: [`kotest-tests/build.gradle.kts`](./kotest-tests/build.gradle.kts)

## Where are the tests?

The tests are in the standard KMP source sets:

- `commonTest`: Kotest specs shared across all targets
  - Example: `src/commonTest/kotlin/FibiTest.kt`
- `jvmTest`: JVM-specific Kotest specs
  - Example: `src/jvmTest/kotlin/JvmFibiTest.kt`
- `androidHostTest`: Android host tests (runs on the host JVM; also uses JUnit Platform)
  - Example: `src/androidHostTest/kotlin/AndroidFibiTest.kt`
- `iosTest`: iOS tests (executed by Kotlin/Native test runners)
  - Example: `src/iosTest/kotlin/IosFibiTest.kt`
- `linuxX64Test`: Linux target tests
  - Example: `src/linuxX64Test/kotlin/LinuxFibiTest.kt`

## Running

From the repo root:

```sh
./gradlew allTests
```

or:

```sh
./gradlew check
```

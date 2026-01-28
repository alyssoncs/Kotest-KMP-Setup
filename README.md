# Kotest on Kotlin Multiplatform (KMP) — template

[![Android Weekly](https://img.shields.io/badge/Android%20Weekly-%23709-green)](https://androidweekly.net/issues/issue-709)
[![Kotlin Weekly](https://img.shields.io/badge/Kotlin%20Weekly-%23494-purple)](https://mailchi.mp/kotlinweekly/kotlin-weekly-494)

> **🚀 updated guide (Jan 2026):**
> 
> The full step-by-step explanation for this setup—including the migration to **Kotest 6.1.0** and **JUnit 6**—is available on my blog.
>
> 👉 **Read: [Setting up Kotest on KMP (Updated)](https://alyssoncirilo.com/blog/kotest-kmp-setup/)**

This repo is a Kotlin Multiplatform (KMP) template focused on **setting up Kotest** in a multiplatform library. It is automatically tested against the latest versions via Renovate.

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

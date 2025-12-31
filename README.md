# Kotest on Kotlin Multiplatform (KMP) — template

This repo is a **Kotlin Multiplatform (KMP)** template focused on **setting up Kotest** in a multiplatform library. Original blog post [here](https://alyssoncirilo.com/blog/kotest-kmp-setup)

It includes a minimal, working test setup across typical KMP source sets (for example: `commonTest`, `iosTest`, `jvmTest`, `androidHostTest`) so you can copy the configuration into your own project.

Attribution: based on the Kotlin Multiplatform Library Template: https://github.com/Kotlin/multiplatform-library-template

> Note: the repo contains two modules that differ only in how JVM tests are executed (Kotest task vs JUnit Platform). Details are below.

## Modules

### 1) `jvm-on-kotest`
Path: [`jvm-on-kotest/`](./jvm-on-kotest)

This module runs JVM tests using Kotest’s dedicated Gradle task (created by the `io.kotest` plugin).

- JVM tests are executed via the `jvmKotest` task.
- `allTests` is wired to depend on `jvmKotest`.
- No `useJUnitPlatform()` is applied to the JVM `Test` task for `jvmTest`.

Relevant build file: [`jvm-on-kotest/build.gradle.kts`](./jvm-on-kotest/build.gradle.kts)

### 2) `jvm-on-junit-platform`
Path: [`jvm-on-junit-platform/`](./jvm-on-junit-platform)

This module runs JVM tests on the standard Gradle `test` task by enabling the **JUnit Platform**.

- JVM `testRuns` are configured with `useJUnitPlatform()`.
- Kotest runs through the JUnit 5 runner dependency (`kotest-runner-junit5`).

Relevant build file: [`jvm-on-junit-platform/build.gradle.kts`](./jvm-on-junit-platform/build.gradle.kts)

## Where are the tests?

Each module includes tests in the standard KMP source sets:

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

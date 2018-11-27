plugins {
    id("kotlin-platform-jvm")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.10")
    expectedBy(project(":client"))
}

buildDir = File(rootProject.projectDir, "gradleBuild/${project.name}")
plugins {
    id("kotlin-platform-common")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.3.10")
}

buildDir = File(rootProject.projectDir, "gradleBuild/${project.name}")
val mainClass = "designPatterns.builderPattern.AppKt"

plugins {
    kotlin("jvm") version "1.3.61"
    application
    idea
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.github.serpro69:kotlin-faker:1.1")
}

repositories {
    mavenCentral()
    maven { url = uri("https://dl.bintray.com/serpro69/maven/") }
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

application{
    mainClassName = mainClass
}

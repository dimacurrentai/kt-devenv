plugins {
    kotlin("jvm") version "1.8.21"
    application
    id("com.adarshr.test-logger") version "3.2.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

application {
    mainClass.set("AppKt")
}

testlogger {
    setTheme("mocha")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

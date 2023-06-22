plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val kotlinVersion = "1.8.22"
dependencies {
    annotationProcessor("org.projectlombok:lombok:latest.release")
    compileOnly("org.projectlombok:lombok:latest.release")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation(platform(kotlin("bom", kotlinVersion)))
    implementation(kotlin("compiler-embeddable"))
    implementation(kotlin("stdlib"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
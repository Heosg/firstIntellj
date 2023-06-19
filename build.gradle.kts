import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

plugins {
    id("org.springframework.boot") version "2.1.7.RELEASE"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("java")
}

group = "com.firstintellj.project"
val currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))
version = "1.0.4-SNAPSHOT-$currentDateTime"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
    // jcenter()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")
    implementation("org.springframework.boot:spring-boot-starter-mustache")
    testImplementation("org.springframework.boot:spring-boot-starter-mustache")
}
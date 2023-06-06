plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // 서버 실행 시키기용 톰켓
    implementation("org.apache.tomcat.embed:tomcat-embed-core:10.1.7")
    implementation("org.apache.tomcat.embed:tomcat-embed-jasper:10.1.7")
    // 서블릿
    implementation("javax.servlet:javax.servlet-api:4.0.1")
    // JSP
    implementation("javax.servlet.jsp.jstl:jstl:1.2")
    // 로거
    implementation("ch.qos.logback:logback-classic:1.4.7")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
plugins {
    id("org.springframework.boot") version("2.6.7")
	id("io.spring.dependency-management") version("1.0.11.RELEASE")
	`java-library`
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webflux")
    annotationProcessor("org.projectlombok:lombok")
	compileOnly ("org.projectlombok:lombok")
    annotationProcessor("systems.manifold:manifold-ext:2022.1.12") {
        because("We want to be able to share easily business rules implementation across different types")
    }
    implementation("systems.manifold:manifold-ext-rt:2022.1.12")
}


tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xplugin:Manifold")
}
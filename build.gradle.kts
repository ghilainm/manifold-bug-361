plugins {
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
    annotationProcessor("org.projectlombok:lombok:1.18.24")
	compileOnly ("org.projectlombok:lombok:1.18.24")
    annotationProcessor("systems.manifold:manifold-ext:2022.1.12")
    implementation("systems.manifold:manifold-ext-rt:2022.1.12")
}


tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xplugin:Manifold")
}
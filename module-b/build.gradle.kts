plugins {
    application
    `java-library`
}

application {
    mainClass.set("bug2.MainKt")
}

dependencies {
    implementation(project(":module-a"))
}

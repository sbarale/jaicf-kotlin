plugins {
    `jaicf-kotlin`
    `jaicf-kotlin-serialization`
    `jaicf-publish`
    `jaicf-junit`
}

dependencies {
    core()

    implementation(`tomcat-servlet`())

    implementation("de.appelgriepsch.logback:logback-gelf-appender" version { logbackGelfAppender })
    implementation(kotlinx("kotlinx-coroutines-slf4j") version { coroutinesCore })

    api(`coroutines-core`())

    api(ktor("ktor-client-cio"))
    api(ktor("ktor-client-logging-jvm"))
    api(ktor("ktor-client-json-jvm"))
    api(ktor("ktor-client-serialization-jvm"))
    api(ktor("ktor-server-netty"))

    testImplementation("io.mockk:mockk" version { mockk })
    testImplementation(kotlin("test-junit"))
    testImplementation(kotlin("test"))
}
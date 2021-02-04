plugins {
    `jaicf-github-release`
}

allprojects {

    group = "com.justai.jaicf"
    version = "0.10.2"

    repositories {
        google()
        jcenter()
        mavenCentral()
        mavenLocal()
        maven(uri("https://jitpack.io"))
    }

}
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("buildSrcLibs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

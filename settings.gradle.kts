rootProject.name = "UiTestAutomation"
include()

pluginManagement {
    includeBuild("convention-android-emulator")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

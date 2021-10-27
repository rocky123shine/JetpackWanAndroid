apply(from = "${rootProject.rootDir}/common.gradle")
apply(plugin = "kotlin-android")

dependencies {
    "implementation"(project(":lib:lib_common"))
    "implementation"(project(":lib:lib_base"))
}
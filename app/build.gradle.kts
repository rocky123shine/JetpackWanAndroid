apply(from = "${rootProject.rootDir}/common.gradle")

dependencies {
    "implementation"(project(":lib:lib_common"))
    "implementation"(project(":lib:lib_cache"))

}
apply(from = "${rootProject.rootDir}/common.gradle")
//在这复写 实现差异化
dependencies {
    "implementation"(project(":lib:lib_base"))
    "implementation"(project(":lib:lib_common"))
}


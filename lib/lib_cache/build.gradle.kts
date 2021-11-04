apply(from = "${rootProject.rootDir}/common.gradle")
//在这复写 实现差异化
dependencies {
    "api"(project(":lib:lib_base"))
    "implementation"(project(":lib:lib_common"))
    "implementation"("androidx.databinding:databinding-runtime:4.1.3")
    //"api"("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")

}


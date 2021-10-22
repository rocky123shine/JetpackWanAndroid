// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    //脚本仓库
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        //脚本插件的依赖
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
//task clean (type: Delete) {
//    delete rootProject . buildDir
//}
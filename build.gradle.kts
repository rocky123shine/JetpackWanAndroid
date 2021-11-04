import com.rocky.config.Versions.koin_version

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    //脚本仓库
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        //脚本插件的依赖
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("org.koin:koin-gradle-plugin:2.2.1")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.5.31")

    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/jcenter") }
        gradlePluginPortal()
    }

}

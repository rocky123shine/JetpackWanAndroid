apply(from = "${rootProject.rootDir}/common.gradle")
dependencies {
    "api"("org.koin:koin-androidx-scope:${com.rocky.config.Versions.koin_version}")
    "api"("org.koin:koin-androidx-viewmodel:${com.rocky.config.Versions.koin_version}")
    "api"("org.koin:koin-androidx-fragment:${com.rocky.config.Versions.koin_version}")
    "api"("org.koin:koin-androidx-workmanager:${com.rocky.config.Versions.koin_version}")
    "api"("org.koin:koin-androidx-compose:${com.rocky.config.Versions.koin_version}")
    "api"("org.koin:koin-androidx-ext:${com.rocky.config.Versions.koin_version}")



    "implementation"("com.squareup.okhttp3:okhttp:${com.rocky.config.Versions.okhttp_version}")
    "implementation"("com.squareup.okhttp3:okhttp-urlconnection:${com.rocky.config.Versions.okhttp_version}")
    "implementation"("com.squareup.okio:okio:2.9.0")
    "implementation"("com.google.code.gson:gson:2.8.6")

//    "implementation"("com.squareup.okhttp:logging-interceptor:4.9.2")


    "api"("com.squareup.retrofit2:retrofit:${com.rocky.config.Versions.retrofit_version}")
    "api"("com.squareup.retrofit2:converter-gson:${com.rocky.config.Versions.retrofit_version}")
    "api"("com.squareup.retrofit2:converter-moshi:${com.rocky.config.Versions.retrofit_version}")
    "api"("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")

}
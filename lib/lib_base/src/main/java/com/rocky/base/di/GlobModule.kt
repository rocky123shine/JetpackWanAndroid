package com.rocky.base.di
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.rocky.base.BuildConfig
import com.rocky.base.constants.BASE_URL
import com.rocky.base.ext.jsonDefault
import com.rocky.base.interceptor.LoggerInterceptor
import kotlinx.serialization.ExperimentalSerializationApi

import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

@ExperimentalSerializationApi
val netModule: Module = module {

    // 单例实现
    single {
        //正常创建 OkhttpClient
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            //.addInterceptor(ParamsInterceptor.Builder().build())
            .addNetworkInterceptor(
                LoggerInterceptor( level = if (BuildConfig.DEBUG) LoggerInterceptor.LEVEL_BODY else LoggerInterceptor.LEVEL_NONE)
            )
            .build()
    }
    // 初始化 retrofit
    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(jsonDefault.asConverterFactory("application/json; charset=UTF-8".toMediaType()))
//            .addConverterFactory(GsonConverterFactory.create())
            //添加 client
            .client(get())//通过get 在scope中 自动去按照参数类型去寻找
            .build()
    }


}
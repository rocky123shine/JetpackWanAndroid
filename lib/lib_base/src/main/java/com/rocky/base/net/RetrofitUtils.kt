package com.rocky.base.net

import org.koin.java.KoinJavaComponent.getKoin
import retrofit2.Retrofit
import kotlin.reflect.KClass

//根据不同的接口（retrofit 网络请求接口声明）返回不同的Service
object RetrofitUtils {
    fun <T> getService(tClazz: Class<T>): T {
        return getKoin().get<Retrofit>().create(tClazz)
    }

}
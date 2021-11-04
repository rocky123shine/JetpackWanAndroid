package com.rocky.base.interceptor

import com.rocky.base.BuildConfig
import okhttp3.internal.platform.Platform

/** 动态参数类型 */
typealias DynamicParams = () -> String

/** 日志打印接口 */
typealias InterceptorLogger = (String) -> Unit

/** 默认日志打印接口 */
val DEFAULT_LOGGER: InterceptorLogger by lazy(LazyThreadSafetyMode.NONE) {
    object : InterceptorLogger {
        override fun invoke(msg: String) {
            if (BuildConfig.DEBUG) {
                Platform.get().log(msg)
            }
        }
    }
}
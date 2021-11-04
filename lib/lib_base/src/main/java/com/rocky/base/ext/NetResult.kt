package com.rocky.base.ext

import com.rocky.base.constants.NET_RESPONSE_CODE_LOGIN_FAILED
import com.rocky.base.constants.NET_RESPONSE_CODE_SUCCESS
import com.rocky.base.net.NetResult

//统一处理网络请求的回掉
inline fun <T> NetResult<T>.handleResponse(
    crossinline onSuccess: NetResult<T>.() -> Unit = {},
    crossinline onFailed: NetResult<T>.() -> Unit = {},
    crossinline onFailed4Login: NetResult<T>.() -> Boolean = { false }
) {
    when (errorCode) {
        NET_RESPONSE_CODE_SUCCESS -> {
            // 请求成功
            onSuccess.invoke(this)
        }
        NET_RESPONSE_CODE_LOGIN_FAILED -> {
            // 登录失效，需要重新登录
            if (onFailed4Login.invoke(this)) {
                // 已消费事件
                return
            }
            //处理登录失败 。。。。。。
        }
        else -> {
            // 请求失败
            onFailed.invoke(this)
        }
    }
}
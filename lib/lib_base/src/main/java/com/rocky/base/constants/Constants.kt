package com.rocky.base.constants

import com.rocky.base.BuildConfig

/** 默认点击过滤间隔时间，单位：ms */
const val DEFAULT_CLICK_THROTTLE_MS = 300L
/** 网络请求响应码 - 失败 */
const val NET_RESPONSE_CODE_FAILED = -1


/** 正式环境  */
private const val API_ONLINE = "https://www.wanandroid.com"
/** 测试环境  */
private const val API_OFFLINE = "https://www.wanandroid.com"

/** 服务器url  */
val BASE_URL = (if (BuildConfig.IS_ONLINE_ENV) API_ONLINE else API_OFFLINE)

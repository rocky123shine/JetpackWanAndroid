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


/** 欢迎界面延时时间 */
const val SPLASH_DELAY_MS = 1_000L

/** Activity 界面跳转动画时长 ms */
const val ACTIVITY_ANIM_DURATION = 230L

/** Dialog 显示动画时长 ms */
const val DIALOG_ANIM_DURATION = 230L

/** 首页返回点击间隔 */
const val MAIN_BACK_PRESS_INTERVAL_MS = 2_000L

/** 首页 Banner 变换间隔 */
const val MAIN_BANNER_TRANSFORM_INTERVAL_MS = 3_000L

/** 请求超时时间 */
const val REQUEST_TIMEOUT = 10_000L


/** 网络请求响应码 - 成功 */
const val NET_RESPONSE_CODE_SUCCESS = 0

/** 网络请求响应码 - 异常 */
const val NET_RESPONSE_CODE_ERROR = -2

/** 网络请求响应码 - 登录失败 */
const val NET_RESPONSE_CODE_LOGIN_FAILED = -1001

/** 网络请求页码开始 */
const val NET_PAGE_START = 0

/** 字符串开关标记 */
const val STR_TRUE = "1"
const val STR_FALSE = "0"

/** 用户信息分隔 */
const val USER_INFO_SPLIT = "\"^-^\""
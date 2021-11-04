package com.rocky.base.net

import com.rocky.base.constants.NET_RESPONSE_CODE_FAILED
import kotlinx.serialization.Serializable

//网络请求返回的基类  D 为具体 的实体类或者 list
@Serializable//使用Kotinx-Serializable 解析数据 泛型类 也必须实现Serializable
data class NetResult<D>(
    val errorCode: Int = NET_RESPONSE_CODE_FAILED,
    val errorMsg: String? = "",
    val data: D? = null
)

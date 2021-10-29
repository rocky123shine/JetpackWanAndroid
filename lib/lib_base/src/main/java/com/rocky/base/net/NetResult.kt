package com.rocky.base.net

import com.rocky.base.constants.NET_RESPONSE_CODE_FAILED
import kotlinx.serialization.Serializable

@Serializable
data class NetResult<D>(
    val errorCode: Int = NET_RESPONSE_CODE_FAILED,
    val errorMsg: String? = "",
    val data: D? = null
)

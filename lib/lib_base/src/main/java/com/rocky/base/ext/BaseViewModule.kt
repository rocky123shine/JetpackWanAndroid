package com.rocky.base.ext

import com.rocky.base.net.NetResult
import com.rocky.base.viewmodlue.BaseViewModule

val BaseViewModule.defaultFailCallback: NetResult<*>.() -> Unit
    get() = {
        //在这里处理通用的失败回掉 例如吐司失败信息
    }
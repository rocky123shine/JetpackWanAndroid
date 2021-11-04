@file:UseContextualSerialization(forClasses = [Cookie::class])

package com.rocky.base.module

import okhttp3.Cookie
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseContextualSerialization

@Serializable
data class CookieEntity(
    val cookies: ArrayList<Cookie>? = arrayListOf()
)
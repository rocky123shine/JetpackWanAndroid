package com.rocky.base.app

import android.app.Application
import com.rocky.base.di.netModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

open class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //注册全局使用的
        startKoin {
            androidContext(this@BaseApplication)
            //初始化 modules  所有需要初始化的 都可以在这里列出来
            modules(listOf(netModule))
        }
    }
}
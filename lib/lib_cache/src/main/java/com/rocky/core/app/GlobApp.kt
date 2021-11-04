package com.rocky.core.app

import com.rocky.base.app.BaseApplication
import com.rocky.core.di.repositoryModule
import com.rocky.core.di.viewModelModule
import org.koin.core.context.loadKoinModules


class GlobApp : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        //在这里配置 未加载的依赖
        loadKoinModules(listOf( repositoryModule,viewModelModule))
    }
}
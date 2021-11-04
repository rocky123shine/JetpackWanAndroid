package com.rocky.core.di

import com.rocky.base.net.RetrofitUtils
import com.rocky.core.net.HomeService
import com.rocky.core.repository.HomeRepository
import com.rocky.core.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/** ViewModel Module */
val viewModelModule: Module = module {
    //所有的module 都在这里声明注入
    viewModel {
        HomeViewModel(get())
    }

}

/** 数据仓库 Module */
val repositoryModule: Module = module {
    single {
        RetrofitUtils.getService(HomeService::class.java)
    }
    //注册 仓库
    factory {
        HomeRepository(get())
    }
}
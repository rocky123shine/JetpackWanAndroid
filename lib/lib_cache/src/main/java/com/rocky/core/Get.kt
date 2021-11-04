package com.rocky.core

import com.rocky.core.viewmodel.HomeViewModel
import org.koin.java.KoinJavaComponent.getKoin

fun getHomeViewModel() = getKoin().get<HomeViewModel>()
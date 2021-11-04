package com.rocky.core.repository

import com.rocky.base.ext.netRequest
import com.rocky.core.net.HomeService


class HomeRepository(private val service: HomeService) {
    //首页轮播图数据
    suspend fun getHomeBannerList() = netRequest {
        service.getHomepageBannerList()
    }

}
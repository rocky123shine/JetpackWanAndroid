package com.rocky.core.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.rocky.base.ext.defaultFailCallback
import com.rocky.base.ext.handleResponse
import com.rocky.base.viewmodlue.BaseViewModule
import com.rocky.core.model.BannerEntity
import com.rocky.core.repository.HomeRepository
import kotlinx.coroutines.launch


class HomeViewModel(private val homeRepository: HomeRepository) : BaseViewModule() {

    /** Banner 列表数据 */
    val bannerData: MutableLiveData<ArrayList<BannerEntity>> = MutableLiveData()

    fun getHomeBannerList() {
        viewModelScope.launch {
            homeRepository.getHomeBannerList().handleResponse(
                onSuccess = {
                    bannerData.value = this.data ?: arrayListOf()
                },
                onFailed = defaultFailCallback
            )
        }
    }
}
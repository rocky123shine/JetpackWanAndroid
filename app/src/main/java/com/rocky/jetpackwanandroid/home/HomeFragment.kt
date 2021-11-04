package com.rocky.jetpackwanandroid.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.gyf.immersionbar.ImmersionBar.getStatusBarHeight
import com.rocky.core.getHomeViewModel
import com.rocky.core.model.BannerEntity
import com.rocky.core.viewmodel.HomeViewModel
import com.rocky.jetpackwanandroid.R
import com.rocky.jetpackwanandroid.databinding.FragmentHomeBinding
import com.rocky.jetpackwanandroid.databinding.ItemHomeBannerBinding

class HomeFragment : Fragment() {
    private lateinit var bind: FragmentHomeBinding
    val viewModel: HomeViewModel = getHomeViewModel()
    private val bannerAdapter = BannerAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.toolbar.apply {
            post {
                layoutParams = layoutParams.apply {
                    height = measuredHeight + getStatusBarHeight(this@HomeFragment)
                }
                setPadding(
                    paddingLeft,
                    paddingTop + getStatusBarHeight(this@HomeFragment),
                    paddingRight,
                    paddingBottom
                )
            }
        }
        viewModel.getHomeBannerList()
        bind.banner.adapter = bannerAdapter
        //获得到轮播图数据显示
        viewModel.bannerData.observe(viewLifecycleOwner, {
            bannerAdapter.list.clear()
            bannerAdapter.list.addAll(it)
            bannerAdapter.notifyItemChanged(0, it.size)
        })


    }

    inner class BannerAdapter : RecyclerView.Adapter<VH>() {
        val list = ArrayList<BannerEntity>()


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH = VH(
            ItemHomeBannerBinding.inflate(layoutInflater, parent, false)
        )

        override fun onBindViewHolder(holder: VH, position: Int) {
            holder.binding.ivImg.load(list[position].imagePath)
            holder.binding.tvDes.text = list[position].desc
        }

        override fun getItemCount(): Int = list.size
    }

    class VH(val binding: ItemHomeBannerBinding) : RecyclerView.ViewHolder(binding.root)
}
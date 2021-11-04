package com.rocky.jetpackwanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.gyf.immersionbar.ImmersionBar
import com.gyf.immersionbar.ktx.immersionBar
import com.rocky.jetpackwanandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        immersionBar {
           // statusBarColor(R.color.theme_color)
            statusBarDarkFont(false)
           // fitsSystemWindows(true)
            initImmersionbar(this)
            addTag(javaClass.simpleName)
        }
        setContentView(binding?.root)
        initView()
    }
    /** 初始化状态栏相关配置 */
    protected open fun initImmersionbar(immersionBar: ImmersionBar) {
    }

    private fun initView() {
        initNavHost()
    }

    private var navController: NavController? = null
    private fun initNavHost() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.findNavController()
        NavigationUI.setupWithNavController(binding!!.bnvMain, navController!!)
    }


    private var mExitTime: Long = 0
    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        //如果不是返回键，则交给系统默认处理
        if (keyCode != KeyEvent.KEYCODE_BACK)
            return super.onKeyDown(keyCode, event)
        if (System.currentTimeMillis() - mExitTime > 2000) {
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show()
            mExitTime = System.currentTimeMillis()
        } else {
            return super.onKeyDown(keyCode, event)
        }
        return true
    }
}
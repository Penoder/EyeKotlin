package com.ronald.eyekotlin.ui.splash

import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ronald.eyekotlin.R
import com.ronald.eyekotlin.databinding.ActivitySplashBinding

/**
 * @author Penoder
 * @date 18-3-15.
 */
class SplashActivity : AppCompatActivity() {

    private var splashBinding: ActivitySplashBinding? = null

    var imgUrl: ObservableField<String> = ObservableField()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        splashBinding!!.setViewModel(this)

        imgUrl.set("https://cn.bing.com/az/hprichbg/rb/PaperboyoOctopus_ZH-CN9384087611_1080x1920.jpg")
    }

}
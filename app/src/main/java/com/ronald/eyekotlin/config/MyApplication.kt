package com.ronald.eyekotlin.config

import android.app.Application

/**
 * @author Penoder
 * @date 18-3-15.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    companion object {

        private var mApp: MyApplication? = null

        fun getInstance(): MyApplication? {
            if (mApp == null) {
                synchronized(MyApplication::class.java) {
                    if (mApp == null) {
                        mApp = MyApplication()
                    }
                }
            }
            return mApp
        }
    }
}

package com.ronald.eyekotlin

import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.penod.mylibrary.mvvm.command.ReplyCommand
import com.ronald.eyekotlin.databinding.ActivityMainBinding
import rx.functions.Action0

class MainActivity : AppCompatActivity() {

    var mainBinding: ActivityMainBinding? = null

    var text: ObservableField<String> = ObservableField("Button")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding!!.setViewModel(this)
    }

    /**
     * 点击事件
     */
    var onClickCommand = ReplyCommand<Any>(Action0 {
        text.set("666666")
    })
}

package com.practice.baselibrary.comon

import android.app.Application
import com.practice.baselibrary.injection.component.AppComponent
import com.practice.baselibrary.injection.component.DaggerAppComponent
import com.practice.baselibrary.injection.module.AppModule

/**
 * Created by guo on 18-7-30.
 * @desc scope注解的作用就是约定component使用范围，没有实际的作用，需要自己实现，例如当前application中的component
 */
class BaseApplication : Application() {
    lateinit var appComponent:AppComponent
    override fun onCreate() {
        super.onCreate()
        injection()
    }

    private fun injection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}
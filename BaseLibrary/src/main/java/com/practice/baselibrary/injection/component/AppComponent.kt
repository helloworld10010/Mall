package com.practice.baselibrary.injection.component

import android.content.Context
import com.practice.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by guo on 18-7-30.
 */
@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {
    fun context():Context
}
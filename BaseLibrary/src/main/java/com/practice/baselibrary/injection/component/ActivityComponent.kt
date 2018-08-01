package com.practice.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.practice.baselibrary.injection.ActivityScope
import com.practice.baselibrary.injection.module.ActivityModule
import com.practice.baselibrary.injection.module.AppModule
import com.practice.baselibrary.injection.module.LifecycleModule
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import javax.inject.Singleton

/**
 * Created by guo on 18-7-30.
 */
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class,LifecycleModule::class))
@ActivityScope
interface ActivityComponent {
    fun activity(): Activity
    fun context():Context
    fun lifecycleProvider(): LifecycleProvider<*>
}
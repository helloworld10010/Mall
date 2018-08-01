package com.practice.baselibrary.injection.module

import android.app.Activity
import com.practice.baselibrary.injection.ActivityScope
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides

/**
 * Created by guo on 18-7-30.
 */
@Module
class LifecycleModule(private val lifecycle: LifecycleProvider<*>) {

    @Provides
    @ActivityScope
    fun providesLifecycle(): LifecycleProvider<*> {
        return lifecycle
    }
}
package com.practice.baselibrary.injection.module

import android.app.Activity
import android.content.Context
import com.practice.baselibrary.comon.BaseApplication
import com.practice.baselibrary.injection.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by guo on 18-7-30.
 */
@Module
class ActivityModule(private val activity:Activity) {

    @Provides
    @ActivityScope
    fun providesContext(): Activity {
        return activity
    }
}
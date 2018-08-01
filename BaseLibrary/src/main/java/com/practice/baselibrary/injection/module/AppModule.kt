package com.practice.baselibrary.injection.module

import android.content.Context
import com.practice.baselibrary.comon.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by guo on 18-7-30.
 */
@Module
class AppModule(private val context: BaseApplication) {

    @Provides
    @Singleton
    fun providesContext():Context{
        return context
    }
}
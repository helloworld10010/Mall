package com.practice.usercenter.injection.componet

import com.practice.baselibrary.injection.PerScope
import com.practice.baselibrary.injection.component.ActivityComponent
import com.practice.usercenter.RegisterActivity
import com.practice.usercenter.injection.usermodule.UserModule
import dagger.Component
import dagger.Module

/**
 * Created by guo on 18-7-26.
 */
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(UserModule::class))
@PerScope
interface UserComponent {
    fun inject(registerActivity:RegisterActivity)
}
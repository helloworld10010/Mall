package com.practice.usercenter.injection.usermodule

import com.practice.usercenter.service.UserService
import com.practice.usercenter.service.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by guo on 18-7-26.
 */
@Module
class UserModule {
    @Provides
    fun provideUserService(service:UserServiceImpl) : UserService{
        return service
    }
}
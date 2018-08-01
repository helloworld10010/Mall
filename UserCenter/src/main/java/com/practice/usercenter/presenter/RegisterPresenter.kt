package com.practice.usercenter.presenter

import com.practice.baselibrary.BaseSubscribe
import com.practice.baselibrary.ext.exec
import com.practice.baselibrary.presenter.BasePresenter
import com.practice.usercenter.presenter.view.RegisterView
import com.practice.usercenter.service.UserService
import javax.inject.Inject

/**
 * Created by link on 18-7-14.
 */
class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {
    @Inject
    lateinit var userService:UserService
    fun register(user:String,verifyCode:String,pwd:String){
        //调用业务层执行登录操作
        userService.register(user,verifyCode,pwd)
                .exec(object:BaseSubscribe<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.registerResult(t)
                    }
                },mLifecycle)
    }
}
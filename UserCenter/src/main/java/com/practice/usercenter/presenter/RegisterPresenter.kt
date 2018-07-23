package com.practice.usercenter.presenter

import com.practice.baselibrary.BaseSubscribe
import com.practice.baselibrary.ext.exec
import com.practice.baselibrary.presenter.BasePresenter
import com.practice.usercenter.service.UserServiceImpl
import com.practice.usercenter.presenter.view.RegisterView

/**
 * Created by link on 18-7-14.
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(user:String,verifyCode:String,pwd:String){
        //调用业务层执行登录操作
        UserServiceImpl().register(user,verifyCode,pwd)
                .exec(object:BaseSubscribe<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.registerResult(t)
                    }
                })
    }
}
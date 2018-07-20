package com.practice.usercenter.presenter

import com.practice.baselibrary.BaseSubscribe
import com.practice.baselibrary.ext.exec
import com.practice.baselibrary.presenter.BasePresenter
import com.practice.usercenter.presenter.service.UserService
import com.practice.usercenter.presenter.service.UserServiceImpl
import com.practice.usercenter.presenter.view.RegisterView
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledThreadPoolExecutor

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
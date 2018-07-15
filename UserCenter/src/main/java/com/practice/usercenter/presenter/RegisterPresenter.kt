package com.practice.usercenter.presenter

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
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object:Subscriber<Boolean>(){
                    override fun onError(e: Throwable?) {
                    }

                    override fun onNext(t: Boolean?) {
                        mView.registerResult(t)
                    }

                    override fun onCompleted() {
                    }
                })
    }
}
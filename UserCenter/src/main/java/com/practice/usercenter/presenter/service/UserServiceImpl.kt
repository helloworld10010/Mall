package com.practice.usercenter.presenter.service

import rx.Observable


/**
 * Created by link on 18-7-15.
 */
class UserServiceImpl : UserService {
    override fun register(user: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

}
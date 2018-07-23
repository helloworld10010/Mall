package com.practice.usercenter.service

import rx.Observable

/**
 * Created by link on 18-7-15.
 * @desc 用户业务层接口
 */
interface UserService {
    fun register(user:String,verifyCode:String,pwd:String) : Observable<Boolean>
}
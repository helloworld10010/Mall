package com.practice.usercenter.data.repository

import com.practice.baselibrary.data.net.RetrofitFactory
import com.practice.baselibrary.data.protocol.BaseResp
import com.practice.usercenter.data.api.UserApi
import com.practice.usercenter.data.protocol.RegisterReq
import rx.Observable

/**
 * Created by guo on 18-7-23.
 * @desc 真正访问网络的地方
 */

class UserRepository {
    fun register(user: String, verifyCode: String, pwd: String) : Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(user,pwd,verifyCode))
    }
}
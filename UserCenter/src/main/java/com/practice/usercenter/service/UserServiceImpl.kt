package com.practice.usercenter.service

import com.practice.baselibrary.data.protocol.BaseResp
import com.practice.baselibrary.ext.BaseException
import com.practice.usercenter.data.repository.UserRepository
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject


/**
 * Created by link on 18-7-15.
 * @desc flatmap 展开某东西 再发射出去(Observable类型)
 *       map 转成具体类型
 */
class UserServiceImpl @Inject constructor() : UserService {

    @Inject
    lateinit var respository:UserRepository
    override fun register(user: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return respository.register(user,verifyCode,pwd)
                .flatMap(Func1<BaseResp<String>, Observable<Boolean>> { t ->
                    if(t.status != 0){
                        return@Func1 Observable.error(BaseException(t.status,t.message))
                    }
                    Observable.just(true)
                })
    }

}
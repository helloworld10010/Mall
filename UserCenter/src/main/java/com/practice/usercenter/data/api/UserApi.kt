package com.practice.usercenter.data.api

import com.practice.baselibrary.data.protocol.BaseResp
import com.practice.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by guo on 18-7-23.
 * @desc retrofit访问接口
 *       请求参数用的RegisterReq实体
 *       返回参数用的string/json即可
 */
interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq) : Observable<BaseResp<String>>
}
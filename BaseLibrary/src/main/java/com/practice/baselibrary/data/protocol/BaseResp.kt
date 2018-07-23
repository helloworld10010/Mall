package com.practice.baselibrary.data.protocol

/**
 * Created by guo on 18-7-23.
 */
class BaseResp<out T> (val status:Int, val message:String, val data:T)
package com.practice.baselibrary.ext

/**
 * Created by guo on 18-7-23.
 */
class BaseException(val status:Int,val msg:String) : Throwable() {
}
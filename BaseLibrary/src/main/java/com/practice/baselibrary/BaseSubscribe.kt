package com.practice.baselibrary

import rx.Subscriber

/**
 * Created by guo on 18-7-20.
 */
open class BaseSubscribe<T> : Subscriber<T>(){
    override fun onCompleted() {
    }

    override fun onNext(t: T) {

    }

    override fun onError(e: Throwable?) {
    }

}
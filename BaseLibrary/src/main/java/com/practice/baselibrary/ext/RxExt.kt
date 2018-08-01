package com.practice.baselibrary.ext

import com.practice.baselibrary.BaseSubscribe
import com.trello.rxlifecycle.LifecycleProvider
import rx.Observable
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

/**
 * Created by guo on 18-7-20.
 */
fun <T> Observable<T>.exec(sub:BaseSubscribe<T>,lifecycleProvider:LifecycleProvider<*>){
    this.observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle())
            .subscribeOn(Schedulers.io())
            .subscribe(sub)
}
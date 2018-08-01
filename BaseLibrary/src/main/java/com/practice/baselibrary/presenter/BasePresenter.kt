package com.practice.baselibrary.presenter

import com.practice.baselibrary.presenter.view.BaseView
import com.trello.rxlifecycle.LifecycleProvider
import javax.inject.Inject

/**
 * Created by link on 18-7-14.
 * @desc 不知道这个类型是什么
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
    @Inject
    lateinit var mLifecycle:LifecycleProvider<*>
}
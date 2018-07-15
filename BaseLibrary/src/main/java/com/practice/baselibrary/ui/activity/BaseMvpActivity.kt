package com.practice.baselibrary.ui.activity

import com.practice.baselibrary.presenter.BasePresenter
import com.practice.baselibrary.presenter.view.BaseView

/**
 * Created by link on 18-7-14.
 * @desc 最高级 mvp 结构的activity，持有presenter引用
 *       presenter派生类有很多，所以用泛型
 */
open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView{

    lateinit var mPresenter:T

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
package com.practice.baselibrary.ui.activity

import android.os.Bundle
import com.practice.baselibrary.comon.BaseApplication
import com.practice.baselibrary.injection.component.ActivityComponent
import com.practice.baselibrary.injection.component.DaggerActivityComponent
import com.practice.baselibrary.injection.module.ActivityModule
import com.practice.baselibrary.injection.module.LifecycleModule
import com.practice.baselibrary.presenter.BasePresenter
import com.practice.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by link on 18-7-14.
 * @desc 最高级 mvp 结构的activity，持有presenter引用
 *       presenter派生类有很多，所以用泛型
 */
open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView{
    @Inject
    lateinit var mPresenter:T
    lateinit var activityComponent:ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injection()
    }

    private fun injection() {
        activityComponent =  DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleModule(LifecycleModule(this))
                .build()
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun showError() {
    }
}
package com.practice.usercenter

import android.os.Bundle
import com.practice.baselibrary.ui.activity.BaseMvpActivity
import com.practice.usercenter.presenter.RegisterPresenter
import com.practice.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun registerResult(status: Boolean?) {
        status?.let {
            toast(status.toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // 在view中调用业务逻辑(presenter)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mRegister.setOnClickListener {
            mPresenter.register(mMobileEt.text.toString(),mVerifyCode.text.toString(),mPasswd.text.toString())
        }
    }
}

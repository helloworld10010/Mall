package com.practice.baselibrary.data.net

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by guo on 18-7-20.
 */
class RetrofitFactory private constructor() {
    companion object {
        val instance : RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val retrofit:Retrofit
    private val interceptor:Interceptor

    init {
        // 看不懂这个语法
        // 接口中只有一个函数的可以用lambda
        // lambda匿名方法 没有方法名也没有访问修饰符和返回值类型
        // 把接口中的函数实现一下回调的时候会用这里的实现
        interceptor = Interceptor {
            // interceptor函数体
            chain ->
                val request = chain.request()
                        .newBuilder()
                        .addHeader("Content-Type","application/json")
                        .addHeader("charset","utf-8")
                        .build()
            chain.proceed(request)
        }
        retrofit = Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build()
    }

    private fun initClient(): OkHttpClient {

        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(initLogInterceptor())
                .connectTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build()
    }

    private fun initLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun <T> create(service : Class<T>) : T{
        return retrofit.create(service)
    }
}
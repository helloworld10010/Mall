package com.practice.baselibrary.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import javax.inject.Scope
import java.lang.annotation.RetentionPolicy.RUNTIME


/**
 * Created by guo on 18-7-30.
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class ActivityScope
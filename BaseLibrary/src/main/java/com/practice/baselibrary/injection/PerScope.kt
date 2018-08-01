package com.practice.baselibrary.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by guo on 18-7-30.
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class PerScope
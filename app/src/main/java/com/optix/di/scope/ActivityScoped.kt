package com.optix.di.scope

import javax.inject.Scope
import kotlin.annotation.Retention

/**
 * Created by Vaibhav Barad
 */
@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScoped

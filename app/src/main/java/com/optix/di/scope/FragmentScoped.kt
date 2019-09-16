package com.optix.di.scope

import javax.inject.Scope
import kotlin.annotation.Retention

/**
 * Created by Vaibhav Barad
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FILE,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
annotation class FragmentScoped

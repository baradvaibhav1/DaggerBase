package com.optix.di.module

import androidx.lifecycle.ViewModelProvider
import com.optix.di.factories.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

/**
 * Created by Vaibhav Barad
 */
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bingdFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory


    //Example Implementation
    /*@Binds
    @IntoMap
    @ViewModelKey(<ViewModelClassToInject>::class)
    abstract fun bindsMovieListViewModel(<ObjectName>: <ViewModelClassToInject>): ViewModel*/
}

package com.optix.di.component

import android.app.Application
import com.optix.di.DIApplication
import com.optix.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Singleton
@Component(
    modules = arrayOf(
        ApplicationModule::class, DatabaseModule::class, NetworkModule::class,
        SharedPrefrenceModule::class, RepositoryModule::class, ViewModelModule::class,
        ActivityBindingModule::class, AndroidSupportInjectionModule::class
    )
)
interface AppComponent : AndroidInjector<DIApplication> {

    override fun inject(app: DIApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
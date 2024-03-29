package com.optix.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.optix.di.BuildConfig
import com.optix.di.repository_helper.shared_preference.PreferencesHelper
import com.optix.di.repository_helper.shared_preference.SharedPrefsHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Vaibhav Barad
 */
@Module
public class SharedPrefrenceModule {

    /*Shared Preference related*/
    //Create shared preference, to inject in shared preference helper method
    @Singleton
    @Provides
    internal fun provideSharedPrefs(application: Application): SharedPreferences {
        return application.getSharedPreferences(BuildConfig.APP_PREFS, Context.MODE_PRIVATE)
    }

    //Inject the created shared preference above and inject in helper
    @Singleton
    @Provides
    internal fun provideSharedPrefsHelper(preferences: SharedPreferences): SharedPrefsHelper {
        return SharedPrefsHelper(preferences)
    }

    /* Since SharedPrefsHelper implements PreferencesHelper, we pass SharedPrefsHelper as argument.
     * Also PreferencesHelper will be the final Object for injections.
     * */
    @Singleton
    @Provides
    internal fun providePreferencesHelper(sharedPrefsHelper: SharedPrefsHelper): PreferencesHelper {
        return sharedPrefsHelper
    }
}
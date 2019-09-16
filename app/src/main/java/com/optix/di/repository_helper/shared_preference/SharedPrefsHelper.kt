package com.optix.di.repository_helper.shared_preference

import android.content.SharedPreferences
import com.optix.di.repository_helper.shared_preference.PreferencesHelper
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Vaibhav Barad
 */

@Singleton
class SharedPrefsHelper @Inject
constructor(private val mSharedPreferences: SharedPreferences) : PreferencesHelper {


}

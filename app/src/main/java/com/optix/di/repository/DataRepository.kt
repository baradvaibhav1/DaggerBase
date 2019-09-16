package com.optix.di.repository

import com.optix.di.repository_helper.database.DatabaseHelper
import com.optix.di.repository_helper.remote.RemoteHelper
import com.optix.di.repository_helper.shared_preference.PreferencesHelper

/**
 * Created by Vaibhav Barad
 */
interface DataRepository : RemoteHelper, DatabaseHelper, PreferencesHelper


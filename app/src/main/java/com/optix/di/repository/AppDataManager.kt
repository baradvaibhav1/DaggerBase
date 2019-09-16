package com.optix.di.repository

import com.optix.di.repository_helper.database.DatabaseHelper
import com.optix.di.repository_helper.remote.RemoteHelper
import com.optix.di.repository_helper.shared_preference.PreferencesHelper
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Vaibhav Barad
 */
@Singleton
class AppDataManager @Inject
constructor(
    private val mDbHelper: DatabaseHelper,
    private val mRemoteHelper: RemoteHelper,
    private val mPrefHelper: PreferencesHelper,
    private val compositeDisposable: CompositeDisposable
) : DataRepository {

    companion object {
        private val TAG = AppDataManager::class.java.canonicalName
    }
}
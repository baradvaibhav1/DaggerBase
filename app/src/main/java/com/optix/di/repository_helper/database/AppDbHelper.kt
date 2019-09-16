package com.optix.di.repository_helper.database

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Vaibhav Barad
 */

@Singleton
class AppDbHelper @Inject
constructor(
    private val mAppDatabase: AppDatabase,
    private val compositeDisposable: CompositeDisposable
) : DatabaseHelper {

    companion object {
        private val TAG = AppDbHelper::class.java.canonicalName
    }


}

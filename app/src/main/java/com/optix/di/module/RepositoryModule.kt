package com.optix.di.module

import com.optix.di.repository.AppDataManager
import com.optix.di.repository_helper.database.DatabaseHelper
import com.optix.di.repository_helper.remote.RemoteHelper
import com.optix.di.repository_helper.shared_preference.PreferencesHelper
import com.optix.di.repository.DataRepository
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Created by Vaibhav Barad
 */
@Module
public class RepositoryModule {


    @Singleton
    @Provides
    internal fun dataRepository(
        databaseHelper: DatabaseHelper,
        remoteHelper: RemoteHelper,
        preferencesHelper: PreferencesHelper,
        compositeDisposable: CompositeDisposable
    ): DataRepository {
        return AppDataManager(databaseHelper, remoteHelper, preferencesHelper, compositeDisposable)
    }

}
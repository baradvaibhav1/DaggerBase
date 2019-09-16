package com.optix.di.module

import android.content.Context
import androidx.room.Room
import com.optix.di.BuildConfig
import com.optix.di.repository_helper.database.AppDatabase
import com.optix.di.repository_helper.database.AppDbHelper
import com.optix.di.repository_helper.database.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Vaibhav Barad
 */
@Module
class DatabaseModule {

    @Provides
    @Singleton
    internal fun AppDatabase(applicationContext: Context): AppDatabase {
        return Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            BuildConfig.DB_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    internal fun provideDbHelper(appDbHelper: AppDbHelper): DatabaseHelper {
        return appDbHelper
    }

}
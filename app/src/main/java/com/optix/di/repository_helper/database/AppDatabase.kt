package com.optix.di.repository_helper.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.optix.di.model.local.AppModel

/**
 * Created by Vaibhav Barad
 */

@Database(entities = arrayOf(AppModel::class), version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {

}

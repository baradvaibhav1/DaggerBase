package com.optix.di.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Vaibhav Barad on 16-Sep-19.
 */
@Entity
data class AppModel(
    @PrimaryKey
    val id: Long?,
    val appVersion: String,
    val lastTimestamp: String,
    val fcmToken: String?
)
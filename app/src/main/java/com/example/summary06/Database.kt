package com.example.summary06

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [AboutInfo::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun aboutInfoDao(): AboutInfoDao
}
package com.example.summary06

import androidx.room.Room

object AboutInfoDatabase {

    val db = Room.databaseBuilder(
        App.appContext!!,
        Database::class.java, "database-name"
    ).build()
}
package com.example.summary06

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface AboutInfoDao {
    @Dao
    interface UserDao {
        @Query("SELECT * FROM aboutInfo")
        fun getAll(): List<AboutInfo>


        @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
                "last_name LIKE :last LIMIT 1")
        fun findByName(first: String, last: String): AboutInfo

        @Insert
        fun insertAll(vararg aboutInfo: AboutInfo)

        @Delete
        fun delete(aboutInfo: AboutInfo)
    }
}
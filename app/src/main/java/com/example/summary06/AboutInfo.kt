package com.example.summary06

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AboutInfo(val title: String,
                     val description: String,
                     val picture: String,
                     @PrimaryKey(autoGenerate = true)
                     val id: Int)
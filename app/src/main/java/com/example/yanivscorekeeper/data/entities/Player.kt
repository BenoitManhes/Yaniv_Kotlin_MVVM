package com.example.yanivscorekeeper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
data class Player(
    @PrimaryKey
    val id: Int
)

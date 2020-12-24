package com.example.yanivscorekeeper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
data class Player(
    @PrimaryKey
    val id: Double,
    var nickname: String? = null,
    var color: Int? = null,
    var imgSrcUrl: String? = null,
    var nbRoundTotal: Int = 0,
    var nbRoundWin: Int = 0,
    var nbGameTotal: Int = 0,
    var nbGameWin: Int = 0
)

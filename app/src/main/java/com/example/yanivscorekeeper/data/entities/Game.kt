package com.example.yanivscorekeeper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import kotlin.collections.ArrayList

@Entity(tableName = "games")
class Game(
    @PrimaryKey
    val id: Double,
    var startDate: Date? = null,
    var endDate: Date? = null,
    var currentRound: Int = 0
) {
    val scores: List<List<Int>> = ArrayList()
    val playersIdList: ArrayList<Int> = ArrayList()

}
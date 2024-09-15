package com.example.tutorial.architecture_components.room_8.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon_tb")
data class PokemonModel(
    @PrimaryKey(autoGenerate = true) var id : Long = 0,
     val firstName: String,
     val lastName: String
)
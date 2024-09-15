package com.example.tutorial.architecture_components.room_8.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.tutorial.architecture_components.room_8.model.PokemonModel

@Dao
interface PokemonDAO {

    @Insert
    fun insert(pokemonModel : PokemonModel)

    @Update
    fun update(pokemonModel : PokemonModel)

    @Delete
    fun delete(pokemonModel : PokemonModel)

    @Query("SELECT * FROM pokemon_tb ORDER BY id ASC")//DESC là từ lớn đên bé, ASC là từ bé đến lớn
    fun getAll(): List<PokemonModel>
}
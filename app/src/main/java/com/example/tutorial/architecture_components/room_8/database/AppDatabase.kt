package com.example.tutorial.architecture_components.room_8.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tutorial.architecture_components.room_8.dao.PokemonDAO
import com.example.tutorial.architecture_components.room_8.model.PokemonModel

@Database(entities = [PokemonModel::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pokemonDAO() : PokemonDAO

    companion object{
        @Volatile
        private var instance : AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "app-database"
        ).allowMainThreadQueries().build()
    }
}
package com.example.tutorial.architecture_components.room_8.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.databinding.ActivityPokemonBinding
import com.example.tutorial.architecture_components.room_8.adapter.PokemonAdapter
import com.example.tutorial.architecture_components.room_8.dao.PokemonDAO
import com.example.tutorial.architecture_components.room_8.database.AppDatabase
import com.example.tutorial.architecture_components.room_8.model.PokemonModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonActivity : AppCompatActivity() {
    lateinit var binding : ActivityPokemonBinding
    var list : ArrayList<PokemonModel> = ArrayList()
    lateinit var pokemonAdapter: PokemonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        binding.btn1.setOnClickListener {
            val pokemonModel = PokemonModel(0,"A","A")
            AppDatabase(this@PokemonActivity).pokemonDAO().insert(pokemonModel)
            list.add(pokemonModel)
            pokemonAdapter.notifyDataSetChanged()
        }

        binding.btn2.setOnClickListener {
            val pokemonModel = PokemonModel(0,"B","B")
            AppDatabase(this@PokemonActivity).pokemonDAO().insert(pokemonModel)
            list.add(pokemonModel)
            pokemonAdapter.notifyDataSetChanged()
        }

        binding.btn3.setOnClickListener {
            val pokemonModel = PokemonModel(0,"C","C")
            AppDatabase(this@PokemonActivity).pokemonDAO().insert(pokemonModel)
            list.add(pokemonModel)
            pokemonAdapter.notifyDataSetChanged()
        }
        list = AppDatabase(this@PokemonActivity).pokemonDAO().getAll() as ArrayList<PokemonModel>
        pokemonAdapter = PokemonAdapter(list)
        binding.rcvPokemon.apply {
            adapter = pokemonAdapter
            layoutManager = LinearLayoutManager(this@PokemonActivity,LinearLayoutManager.VERTICAL,false)
            setHasFixedSize(true)
        }
    }

}




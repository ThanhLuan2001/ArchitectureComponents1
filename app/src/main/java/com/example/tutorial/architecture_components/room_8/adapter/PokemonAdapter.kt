package com.example.tutorial.architecture_components.room_8.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorial.architecture_components.databinding.ItemPokemonBinding
import com.example.tutorial.architecture_components.room_8.model.PokemonModel

class PokemonAdapter(val list : ArrayList<PokemonModel>) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>(){

    inner class PokemonViewHolder(val binding : ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(pokemonModel: PokemonModel){
            binding.apply {
                tvId.text = "${pokemonModel.id}"
                tvFirstname.text = pokemonModel.firstName
                tvLastname.text = pokemonModel.lastName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPokemonBinding.inflate(layoutInflater,parent,false)
        return PokemonViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemonModel = list[position]
        holder.bind(pokemonModel)
    }
}
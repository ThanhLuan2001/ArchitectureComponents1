package com.example.tutorial.architecture_components.binding_adapter_5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorial.architecture_components.binding_adapter_5.`interface`.ClickUser
import com.example.tutorial.architecture_components.binding_adapter_5.model.UserModel
import com.example.tutorial.architecture_components.databinding.ItemUserBinding


class UserAdapter(val context : Context,val list : ArrayList<UserModel>,val clickUser: ClickUser) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){


    inner class UserViewHolder(var binding : ItemUserBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(userModel: UserModel){
            binding.userModel = userModel
            binding.root.setOnClickListener {
                clickUser.itemUser(userModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ItemUserBinding = ItemUserBinding.inflate(layoutInflater,parent,false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userModel = list[position]
        holder.bind(userModel)
    }
}
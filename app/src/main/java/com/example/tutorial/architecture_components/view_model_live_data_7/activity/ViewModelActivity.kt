package com.example.tutorial.architecture_components.view_model_live_data_7.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.databinding.ActivityViewModelBinding
import com.example.tutorial.architecture_components.view_model_live_data_7.model.ModelViewViewModel

class ViewModelActivity : AppCompatActivity() {
    lateinit var binding : ActivityViewModelBinding
    lateinit var modelViewViewModel: ModelViewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_model)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        try {
            modelViewViewModel = ViewModelProvider(this)[ModelViewViewModel::class.java]
            modelViewViewModel.number.observe(this) {number ->
                binding.number = number.toString()
            }

            binding.btnCount.setOnClickListener {
                modelViewViewModel.updateNumber()
            }
        }catch (e : RuntimeException){
            e.printStackTrace()
        }
    }
}
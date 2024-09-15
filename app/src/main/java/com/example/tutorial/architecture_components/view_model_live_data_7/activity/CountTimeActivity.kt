package com.example.tutorial.architecture_components.view_model_live_data_7.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.databinding.ActivityCheckBinding
import com.example.tutorial.architecture_components.databinding.ActivityCountTimeBinding
import com.example.tutorial.architecture_components.view_model_live_data_7.model.CountTimeViewModel

class CountTimeActivity : AppCompatActivity() {
    lateinit var binding : ActivityCountTimeBinding
    lateinit var countTimeViewModel: CountTimeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_count_time)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.click = CountTimeActivityClick()
        countTimeViewModel = ViewModelProvider(this)[CountTimeViewModel::class.java]
        countTimeViewModel.second.observe(this) { binding.second = it }
    }

    inner class CountTimeActivityClick{
        fun start(){
            countTimeViewModel.startTime()
        }

    }
}
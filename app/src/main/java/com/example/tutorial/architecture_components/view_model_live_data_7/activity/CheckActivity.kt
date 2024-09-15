package com.example.tutorial.architecture_components.view_model_live_data_7.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.databinding.ActivityCheckBinding
import com.example.tutorial.architecture_components.view_model_live_data_7.model.CheckViewModel

class CheckActivity : AppCompatActivity() {
    lateinit var binding : ActivityCheckBinding
    lateinit var checkViewModel: CheckViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_check)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.click = CheckAcivityClick(this)
        checkViewModel = ViewModelProvider(this)[CheckViewModel::class.java]
        checkViewModel.apply {
            currentNumber.observe(this@CheckActivity) { binding.currentNumber = it }
            currentIsCheck.observe(this@CheckActivity) { binding.currentIsCheck = it }
        }
    }


    inner class CheckAcivityClick(var context: Context){
        fun thongBao() : Boolean{
            checkViewModel.currentNumber.value = ++checkViewModel.number
            checkViewModel.currentIsCheck.value = checkViewModel.number % 2 == 0
            return true
        }
    }
}
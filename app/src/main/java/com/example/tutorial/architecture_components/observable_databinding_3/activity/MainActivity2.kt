package com.example.tutorial.architecture_components.observable_databinding_3.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.observable_databinding_3.model.Activity2ViewModel
import com.example.tutorial.architecture_components.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    var age = 18
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2)
        setContentView(binding.root)

        val activity2ViewModel = Activity2ViewModel()
        activity2ViewModel.message.set("Nội dung ban đầu")
        activity2ViewModel.age.set(age)

        binding.apply {
            viewModel = activity2ViewModel

            btnChange.setOnClickListener {
                age +=1
                activity2ViewModel.message.set(editQuery.text.toString())
                activity2ViewModel.age.set(age)
            }
        }

    }

}
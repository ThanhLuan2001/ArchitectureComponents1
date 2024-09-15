package com.example.tutorial.architecture_components.gone_visible_4.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.gone_visible_4.model.ViewTViewModel
import com.example.tutorial.architecture_components.databinding.ActivityViewBinding

class ViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view)
        setContentView(binding.root)
        val viewTViewModel = ViewTViewModel()
        viewTViewModel.isShow.set(false)
        binding.viewTViewModel = viewTViewModel
    }

}


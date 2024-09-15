package com.example.tutorial.architecture_components.binding_adapter_5.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.binding_adapter_5.model.UserModel
import com.example.tutorial.architecture_components.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    lateinit var binding : ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_image)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val userModel = intent.getSerializableExtra("userModel") as UserModel
        binding.userModel = userModel
    }
}
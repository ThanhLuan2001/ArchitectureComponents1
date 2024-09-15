package com.example.tutorial.architecture_components.set_data_activity_1.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.set_data_activity_1.model.MainViewModel
import com.example.tutorial.architecture_components.binding_adapter_5.model.UserModel
import com.example.tutorial.architecture_components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        binding.mainViewModel = MainViewModel("Luậnnn")
        binding.userModel = UserModel("Nguyễn Thành Luận - 22 - Hải Phòng")
        binding.source = R.drawable.img

    }
}
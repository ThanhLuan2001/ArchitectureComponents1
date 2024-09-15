package com.example.tutorial.architecture_components.lifecycle_6.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.lifecycle_6.lifecycle.MyObserver
import com.example.tutorial.architecture_components.databinding.ActivityLifecycleBinding

class LifecycleActivity : AppCompatActivity() {
    lateinit var binding : ActivityLifecycleBinding
    lateinit var myObserver: MyObserver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_lifecycle)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        myObserver = MyObserver(this,lifecycle)
        lifecycle.addObserver(myObserver)
        button()
    }

    private fun button(){

        binding.btn.setOnClickListener {
            if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)){
                Toast.makeText(this,"STARTED",Toast.LENGTH_SHORT).show()
            }
        }
    }


}
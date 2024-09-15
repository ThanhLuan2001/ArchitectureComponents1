package com.example.tutorial.architecture_components.view_model_live_data_7.model

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountTimeViewModel : ViewModel(){

    private lateinit var timer : CountDownTimer

    val second : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun startTime(){
        timer = object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = millisUntilFinished/1000
                second.value = timeLeft.toInt()
            }

            override fun onFinish() {
            }

        }
        timer.start()
    }

//    fun stopTime(){
//        timer.cancel()
//    }


}
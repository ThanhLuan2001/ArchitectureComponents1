package com.example.tutorial.architecture_components.view_model_live_data_7.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ModelViewViewModel : ViewModel(){
    var number = MutableLiveData<Int>()

     init {
        number.value = 1
    }

    fun updateNumber(){
        number.value = (number.value)?.plus(1)
    }

}

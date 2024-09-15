package com.example.tutorial.architecture_components.observable_databinding_3.model

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class Activity2ViewModel : BaseObservable() {
    var message  = ObservableField<String>()
    var age = ObservableInt()

    fun changeMessage(){
        message.set("Nội dung đã được thay đổi")
    }

    fun changeAge(){
        age.set(20)
    }
}

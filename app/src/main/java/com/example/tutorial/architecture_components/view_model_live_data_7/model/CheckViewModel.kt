package com.example.tutorial.architecture_components.view_model_live_data_7.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CheckViewModel : ViewModel(){
    var number = 0

    val currentNumber : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentIsCheck : MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }

//    var currentNumber : MutableLiveData<Int> = MutableLiveData()
//
//    val currentIsCheck : MutableLiveData<Boolean> = MutableLiveData()

    // có 2 cách khai báo currentNumber và currentIsCheck,dùng cái nào cũng được, nhưng để tối ưu hơn thì dùng cái đầu tiên

    //link tham khảo chi tiết : https://www.youtube.com/watch?v=N7J27pBTtuI
}
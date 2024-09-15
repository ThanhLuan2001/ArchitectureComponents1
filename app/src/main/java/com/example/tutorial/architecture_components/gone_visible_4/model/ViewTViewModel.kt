package com.example.tutorial.architecture_components.gone_visible_4.model

import androidx.databinding.ObservableBoolean

class ViewTViewModel{
    var isShow = ObservableBoolean()
    fun showView(){
        isShow.set(true)
    }
}
package com.example.tutorial.architecture_components.set_data_activity_1.model

import android.util.Log
import android.view.View
import com.example.tutorial.architecture_components.binding_adapter_5.model.UserModel

class MainViewModel(val name : String) {

    val TAG = "zzzzzzz"

    fun notifi(){
        Log.e(TAG,"Đây là hệ thống LBX")
    }

    fun name(name :String){
        Log.e(TAG,name)
    }

    fun fullname(full_name :String,view: View){
        Log.e(TAG,full_name)
    }

    fun user(userModel: UserModel){
        Log.e(TAG,userModel.name)
    }
}
package com.example.tutorial.architecture_components.binding_adapter_5.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.binding_adapter_5.adapter.UserAdapter
import com.example.tutorial.architecture_components.binding_adapter_5.`interface`.ClickUser
import com.example.tutorial.architecture_components.binding_adapter_5.model.UserModel
import com.example.tutorial.architecture_components.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    lateinit var binding : ActivityListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.apply {
            rcvUser.layoutManager = LinearLayoutManager(this@ListActivity,
                LinearLayoutManager.VERTICAL,false)
            rcvUser.setHasFixedSize(true)
            rcvUser.adapter = UserAdapter(this@ListActivity,getList(),object : ClickUser {
                override fun itemUser(userModel: UserModel) {
                    val bundle = Bundle()
                    bundle.putSerializable("userModel",userModel)
                    val intent = Intent(this@ListActivity,ImageActivity::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            })
        }
    }

    private fun getList() : ArrayList<UserModel>{
        val list = ArrayList<UserModel>()
        list.apply {
            add(UserModel("https://www.simplilearn.com/ice9/free_resources_article_thumb/what_is_image_Processing.jpg"))
            add(UserModel("https://buffer.com/cdn-cgi/image/w=1000,fit=contain,q=90,f=auto/library/content/images/size/w1200/2023/10/free-images.jpg"))
            add(UserModel("https://dfstudio-d420.kxcdn.com/wordpress/wp-content/uploads/2019/06/digital_camera_photo-1080x675.jpg"))
            add(UserModel("https://www.seiu1000.org/sites/main/files/main-images/camera_lense_0.jpeg"))
            add(UserModel("https://www.powertrafic.fr/wp-content/uploads/2023/04/image-ia-exemple.png"))
            add(UserModel("https://imgv3.fotor.com/images/share/Unblur-image-online-automatically-with-Fotor-AI-image-deburring-tool.jpg"))
        }
        return list
    }
}
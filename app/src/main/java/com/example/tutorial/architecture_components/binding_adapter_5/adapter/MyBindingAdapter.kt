package com.example.tutorial.architecture_components.binding_adapter_5.adapter

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class MyBindingAdapter {
    companion object{
        @BindingAdapter("imageUrl","error")
        @JvmStatic
        fun loadImage(view: ImageView, imageUrl: String, error : Drawable) {
            Glide.with(view.context)
                .load(imageUrl)
                .error(error)
                .into(view)
        }
    }
}
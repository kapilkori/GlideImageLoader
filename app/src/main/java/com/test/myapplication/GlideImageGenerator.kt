package com.test.myapplication

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object GlideImageGenerator {

    fun loadImage(context: Context, url: String, viewId: ImageView) {
        Glide.with(context)
            .load(url)
            .into(viewId)
    }
}
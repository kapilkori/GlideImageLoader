package com.test.glideimage

import android.content.Context
import android.widget.ImageView
import com.test.myapplication.GlideImageGenerator

object GlideImage {

    fun load(context: Context, url: String, viewId: ImageView) =
        GlideImageGenerator.loadImage(context, url, viewId)
}
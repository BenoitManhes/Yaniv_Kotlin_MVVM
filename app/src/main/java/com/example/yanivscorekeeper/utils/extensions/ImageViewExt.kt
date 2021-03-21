package com.example.yanivscorekeeper.utils.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageFromUrl(imgUrl: String?) {
    imgUrl?.let {
        Glide.with(context)
            .load(imgUrl)
            .dontTransform()
            .into(this)
    }
}
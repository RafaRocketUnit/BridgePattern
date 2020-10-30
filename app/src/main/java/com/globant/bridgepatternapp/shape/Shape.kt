package com.globant.bridgepatternapp.shape

import android.graphics.drawable.GradientDrawable
import android.widget.ImageView

interface Shape {
    fun draw(imageView: ImageView, shape: GradientDrawable)
}
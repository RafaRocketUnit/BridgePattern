package com.globant.bridgepatternapp.shape

import android.graphics.drawable.GradientDrawable
import android.widget.ImageView
import com.globant.bridgepatternapp.color.Color

class Square(private val side: Float, private val color: Color) : Shape {

    override fun draw(imageView: ImageView, shape: GradientDrawable) {
        shape.shape = GradientDrawable.RECTANGLE
        shape.cornerRadii =
            floatArrayOf(side, side, side, side, side, side, side, side)
        color.fill(shape)
        imageView.setImageDrawable(shape)
    }
}
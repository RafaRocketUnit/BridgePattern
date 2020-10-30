package com.globant.bridgepatternapp.shape

import android.graphics.drawable.GradientDrawable
import android.widget.ImageView
import com.globant.bridgepatternapp.color.Color


class Circle(private val radius: Float, private val color: Color) : Shape {

    override fun draw(imageView: ImageView, shape: GradientDrawable) {
        println("Create a circle with radius: $radius")
        shape.shape = GradientDrawable.OVAL
        shape.cornerRadii = floatArrayOf(radius, radius, radius, radius, radius, radius, radius, radius)
        color.fill(shape)
        imageView.setImageDrawable(shape)
    }

}
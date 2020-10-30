package com.globant.bridgepatternapp.color

import android.graphics.drawable.GradientDrawable

class StrokeColor(private val size: Int, private val color: Int) : Color {
    override fun fill(shape: GradientDrawable) {
        shape.setStroke(size, color)
    }
}
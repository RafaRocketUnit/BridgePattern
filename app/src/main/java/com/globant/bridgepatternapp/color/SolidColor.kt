package com.globant.bridgepatternapp.color

import android.graphics.drawable.GradientDrawable


class SolidColor(private val color: Int) : Color {
    override fun fill(shape: GradientDrawable) {
        shape.setColor(color)
    }
}
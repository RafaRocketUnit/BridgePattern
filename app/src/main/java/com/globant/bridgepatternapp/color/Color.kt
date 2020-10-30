package com.globant.bridgepatternapp.color

import android.graphics.drawable.GradientDrawable

interface Color {
    fun fill(shape: GradientDrawable)
}
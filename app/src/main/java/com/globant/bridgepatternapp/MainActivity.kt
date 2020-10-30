package com.globant.bridgepatternapp

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.globant.bridgepatternapp.color.SolidColor
import com.globant.bridgepatternapp.color.StrokeColor
import com.globant.bridgepatternapp.shape.Circle
import com.globant.bridgepatternapp.shape.Shape
import com.globant.bridgepatternapp.shape.Square
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Circle(7f, SolidColor(Color.BLUE)).draw(imageView1, GradientDrawable())
        Square(10f, StrokeColor(10, Color.GRAY)).draw(imageView2, GradientDrawable())
        Circle(7f, StrokeColor(10, Color.BLACK)).draw(imageView3, GradientDrawable())
    }
}
package com.example.toddlerslearningapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.toddlerslearningapp.PaintView.Companion.colorList
import com.example.toddlerslearningapp.PaintView.Companion.currentBrush
import com.example.toddlerslearningapp.PaintView.Companion.pathList

class Painting : AppCompatActivity() {
    companion object{
        var path=Path()
        var paintBrush=Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_painting)
        /*to hide toddler's learning app on top use this code
        supportActionBar?.hide()*/
        val redBtn=findViewById<ImageButton>(R.id.redColor)
        val blueBtn=findViewById<ImageButton>(R.id.blueColor)
        val blackBtn=findViewById<ImageButton>(R.id.blackColor)
        val greenBtn=findViewById<ImageButton>(R.id.greenColor)
        val eraser=findViewById<ImageButton>(R.id.whiteColor)
        redBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        greenBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
           pathList.clear()
            colorList.clear()
            path.reset()
//            paintBrush.color = Color.WHITE
//            currentColor(paintBrush.color)
        }

    }
    private fun currentColor(color: Int){
        currentBrush =color
        path = Path()
    }
}
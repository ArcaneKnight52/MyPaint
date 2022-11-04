package com.example.mypaint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.mypaint.PaintView.Companion.colorList
import com.example.mypaint.PaintView.Companion.currentBrush
import com.example.mypaint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {


    companion object{
        var path=Path()
        var paintbrush= Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val rbtn = findViewById<ImageButton>(R.id.redColor)
        val bluebtn = findViewById<ImageButton>(R.id.blueColor)
        val blackbtn = findViewById<ImageButton>(R.id.blackColor)
        val wbtn = findViewById<ImageButton>(R.id.whiteColor)

        rbtn.setOnClickListener {
            Toast.makeText(this,"CLicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.RED
            currentcolor(paintbrush.color)
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this,"CLicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.BLUE
            currentcolor(paintbrush.color)
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this,"CLicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.BLACK
            currentcolor(paintbrush.color)
        }
        wbtn.setOnClickListener {
            Toast.makeText(this,"CLicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentcolor(color:Int){
        currentBrush = color
        path = Path()
    }
}
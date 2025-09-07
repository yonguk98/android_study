package com.yongwook.twice

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.imageArea)

//        Toast.makeText(this, getData, Toast.LENGTH_SHORT).show()

        if (getData == "1"){
            memberImage.setImageResource(R.drawable.p1)
        }
        if (getData == "2"){
            memberImage.setImageResource(R.drawable.p2)
        }
    }
}
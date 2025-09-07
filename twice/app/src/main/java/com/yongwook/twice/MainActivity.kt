package com.yongwook.twice

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageView>(R.id.image1)
        val btn2 = findViewById<ImageView>(R.id.image2)
        val btn3 = findViewById<ImageView>(R.id.image3)
        val btn4 = findViewById<ImageView>(R.id.image4)
        val btn5 = findViewById<ImageView>(R.id.image5)
        val btn6 = findViewById<ImageView>(R.id.image6)
        val btn7 = findViewById<ImageView>(R.id.image7)
        btn1.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }

    }
}
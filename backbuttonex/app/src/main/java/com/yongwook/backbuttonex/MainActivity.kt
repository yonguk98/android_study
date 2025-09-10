package com.yongwook.backbuttonex

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private  var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onBackPressed() {
        if(isDouble == true){
            finish()
        }
        isDouble = true
        Toast.makeText(this, "종료할거면 더블 클릭!", Toast.LENGTH_LONG).show()
        android.os.Handler().postDelayed(Runnable {
            isDouble = false
        }, 2000)
    }
}
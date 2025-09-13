package com.yongwook.diet_memo

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        auth = Firebase.auth

        try {
            Log.d("SplashActivity", auth.currentUser!!.uid)
            Toast.makeText(
                baseContext,
                "원래 비회원",
                Toast.LENGTH_SHORT,
            ).show()
            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish() }, 2000)

        } catch (e: Exception) {
            Log.d("SplashActivity", "회원가입 필요")

            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(
                            baseContext,
                            "비회원 로그인 성공",
                            Toast.LENGTH_SHORT,
                        ).show()
                        val user = auth.currentUser

                        Handler().postDelayed({
                            startActivity(Intent(this, MainActivity::class.java))
                            finish() }, 2000)

                    } else {
                        Toast.makeText(
                            baseContext,
                            "비회원 로그인 실패",
                            Toast.LENGTH_SHORT,
                        ).show()
                    }
                }
        }


    }
}

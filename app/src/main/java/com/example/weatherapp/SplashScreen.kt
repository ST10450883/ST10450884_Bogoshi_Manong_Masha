package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val nextButton=findViewById<Button>(R.id.nextButton)
        val exitButton= findViewById<Button>(R.id.exitButton)

        nextButton.setOnClickListener {
            val intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finish()
        }
    }
}
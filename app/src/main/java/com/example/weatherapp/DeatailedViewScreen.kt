package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DeatailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatailed_view_screen)

        val day=intent.getStringArrayExtra("days")?:arrayListOf()
        val max = intent.getIntegerArrayListExtra("max") ?: arrayListOf()
        val min = intent.getIntegerArrayListExtra("min") ?: arrayListOf()
        val weatherCoNDITION= intent.getStringArrayListExtra("weatherCondition") ?: arrayListOf()
        val details = findViewById<TextView>(R.id.detailsTextView)
        val backButton=findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
    }
}
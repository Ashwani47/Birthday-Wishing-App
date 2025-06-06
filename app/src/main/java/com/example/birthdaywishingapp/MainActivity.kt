package com.example.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.et)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val str = et.text.toString()
            val intent = Intent(this,MainActivity2::class.java).putExtra("et",str)
            startActivity(intent)
        }
    }
}
package com.example.birthdaywishingapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv2 = findViewById<TextView>(R.id.tv2)
        val strfetch = intent.getStringExtra("et")
        tv2.text = strfetch
        Toast.makeText(this,"HURRAY!!!",Toast.LENGTH_LONG).show()
    }
}
package com.codinginflow.sgpacalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    private lateinit var cgpaTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        cgpaTextView = findViewById(R.id.cgpa)
        val cgpa = intent.getFloatExtra("CGPA", 0f)

        // Set the CGPA value to the TextView
        cgpaTextView.text = "$cgpa"

        findViewById<Button>(R.id.back).setOnClickListener(){
            var i= Intent(this,MainActivity3::class.java);
            startActivity(i)
        }
    }
}
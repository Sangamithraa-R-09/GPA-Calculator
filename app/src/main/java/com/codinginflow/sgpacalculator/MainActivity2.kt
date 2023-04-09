package com.codinginflow.sgpacalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<Button>(R.id.next).setOnClickListener(){
            val s= findViewById<EditText>(R.id.sem).text.toString()
            val subject=findViewById<EditText>(R.id.sub).text.toString()
            val cre=findViewById<EditText>(R.id.credits).text.toString()
            if(s.equals("") && subject.equals("") && cre.equals("")){
                Toast.makeText(this,"Empty fields are not allowed",Toast.LENGTH_SHORT).show()
            }
            else{
                var i=Intent(this,MainActivity3::class.java);
                intent.putExtra("MAX_COURSES", subject)
                startActivity(i)
            }
        }
        findViewById<Button>(R.id.back).setOnClickListener(){
            var i=Intent(this,MainActivity::class.java);
            startActivity(i)
        }
    }
}
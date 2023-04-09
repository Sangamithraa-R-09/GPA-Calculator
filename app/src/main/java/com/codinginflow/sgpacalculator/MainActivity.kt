package com.codinginflow.sgpacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener(){
            val name=findViewById<EditText>(R.id.et1).text.toString()
            val reg=findViewById<EditText>(R.id.et2).text.toString()
            val year=findViewById<EditText>(R.id.et3).text.toString()

            if(name!="" && reg!="" && year!=""){
                var i = Intent(this,MainActivity2::class.java)
                startActivity(i)
            }
            else{
                Toast.makeText(this,"Empty fields are not allowed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
package com.codinginflow.sgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    private lateinit var gradePointEditText: EditText
    private lateinit var creditEditText: EditText
    private lateinit var addButton: Button
    private lateinit var calculateButton: Button
    private var totalCredits: Int = 0
    private var totalGradePoints: Float = 0f
    private var currentCourses: Int = 0
    private var maxCourses: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        maxCourses = intent.getIntExtra("MAX_COURSES", 0)

        gradePointEditText = findViewById(R.id.edit_text)
        creditEditText = findViewById(R.id.edit_text2)
        addButton = findViewById(R.id.bt1)
        calculateButton = findViewById(R.id.bt2)

        addButton.setOnClickListener {
            // Get entered grade points and credits
            val gradePoint = gradePointEditText.text.toString().toFloatOrNull()
            val credits = creditEditText.text.toString().toIntOrNull()

            // If both grade points and credits are valid
            if (gradePoint != null && credits != null) {
                // Add to total grade points and credits
                totalGradePoints += gradePoint * credits
                totalCredits += credits

                // Clear the input fields
                gradePointEditText.text.clear()
                creditEditText.text.clear()
            }
        }


        calculateButton.setOnClickListener {
            // Calculate CGPA
            if (totalCredits >= 0) {
                val cgpa = totalGradePoints / totalCredits
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("CGPA", cgpa)
                startActivity(intent)
            }
        }
    }
}
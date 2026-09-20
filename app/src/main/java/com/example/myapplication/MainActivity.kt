package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNameStudent = findViewById<EditText>(R.id.etFullName)
        val etPoints = findViewById<EditText>(R.id.etPoints)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val studentName = etNameStudent.text.toString()
            val points: Int? = etPoints.text.toString().toIntOrNull()

            val student = Student(studentName,  points)

            val grade = Calculator.calculatePoints(student.points)

            val summary = """
                Student: ${student.studentName}
                Punkty: ${student.points ?: "brak"}
                Ocena: $grade
            """.trimIndent()

            tvResult.text = summary
        }
    }
}
package com.example.kilo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtDisplay = findViewById<TextView>(R.id.txtDisplay)
        val edtText = findViewById<EditText>(R.id.edtText)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnCompute.setOnClickListener {
            val time = edtText.text.toString()

            if (time.lowercase() == "morning") {
                txtDisplay.text = "Send a Good Morning!"
            } else if (time.lowercase() == "afternoon") {
                txtDisplay.text = "Send a Good Afternoon!"
            } else if (time.lowercase() == "evening") {
                txtDisplay.text = "Send a Good Evening!"
            } else if (time.lowercase() == "dinner") {
                txtDisplay.text = "It is dinner time!"
            } else if (time.lowercase() == "breakfast") {
                txtDisplay.text = "What do want for breakfast?"
            } else if (time.lowercase() == "lunch") {
                txtDisplay.text = "What would you like for lunch?"
            } else if (time.lowercase() == "supper") {
                txtDisplay.text = "What would you like for dinner"
            } else {
                txtDisplay.text = "Invalid Input"
            }
        }

        btnClear.setOnClickListener {
            edtText.text.clear()
            txtDisplay.text = ""
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
//Referencing
//[1] The Independant Institute of Education, "IMAD5112 Module Manual 2026," pp. 55-58, Unpublished in
//[2] S. Mhlanga, IMAD Lecturer, Emeris, Pretoria, Class Instruction on Android development, 2026.
//[3] https://kotlinlang.org/docs/home.html
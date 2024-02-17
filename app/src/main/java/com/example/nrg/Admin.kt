package com.example.nrg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val submit: Button = findViewById(R.id.submit)
        val name: EditText = findViewById(R.id.name_admin)
        val password: EditText = findViewById(R.id.password)

        submit.setOnClickListener {
//            val enteredName = name.text.toString()
//            val enteredPassword = password.text.toString()

//            if (enteredName == "admin" && enteredPassword == "admin123") {
                val intent = Intent(this, Construction::class.java)
                startActivity(intent)
//            } else {
//                // Show an error message or handle the incorrect credentials scenario
//                // For example, you can display a Toast message
//                Toast.makeText(this, "Incorrect credentials", Toast.LENGTH_SHORT).show()
//            }
        }
    }


}

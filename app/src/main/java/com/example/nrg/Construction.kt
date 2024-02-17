package com.example.nrg

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Construction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_construction)

        val habri:TextView=findViewById(R.id.Habri_Daba);
        habri.setOnClickListener{
            val intent = Intent(this, HubriDaba::class.java)

            // Start the new activity
            startActivity(intent)
        }
    }
}
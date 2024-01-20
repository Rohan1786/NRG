package com.example.nrg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Const:ImageButton=findViewById(R.id.Construction);

        Const.setOnClickListener{
            val intent = Intent(this, Construction::class.java)

            // Start the new activity
            startActivity(intent)
        }


    }
}
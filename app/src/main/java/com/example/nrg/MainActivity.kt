package com.example.nrg

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Const:ImageButton=findViewById(R.id.Construction);

        Const.setOnClickListener{
            val intent = Intent(this, Admin::class.java)

            // Start the new activity
            startActivity(intent)
        }
        val menu:ImageView=findViewById(R.id.menu);

        menu.setOnClickListener {
            val intent=Intent(this,Menu::class.java)

            startActivity(intent)
        }

//        val calculator:ImageView=findViewById(R.id.calculator);
//        calculator.setOnClickListener {
//            val intent=Intent(this,Calculator::class.java);
//            startActivity(intent)
//        }


    }
}
package com.example.nrg

// src/main/java/com/yourpackage/SplashActivity.kt


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000 // 1 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)

        // Show the progress bar
        ProgressBar.VISIBLE.also { progressBar.visibility = it }

        // Use a Handler to delay the opening of the main activity

            // Hide the progress bar



        // Use a Handler to delay the opening of the main activity
        Handler().postDelayed({
            progressBar.visibility = ProgressBar.INVISIBLE
            // Start the main activity after the splash delay
            startActivity(Intent(this@MainActivity2, MainActivity::class.java))
            finish() // Close the splash activity
        }, SPLASH_DELAY)
    }
}

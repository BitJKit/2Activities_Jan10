package com.example.a2activities_jan10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity: AppCompatActivity() {

    private lateinit var mainBtn: Button

    // Create your views and attach xml
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        mainBtn = findViewById(R.id.btnMain)
        mainBtn.text = getString(R.string.first_screen)
        mainBtn.setOnClickListener {
            // Action we want the OS to take
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
    }

    // The activity is coming into view
    override fun onStart() {
        super.onStart()
    }

    // When activity is on screen and user can interact
    override fun onResume() {
        super.onResume()
    }

    // Pause starting to go in background
    override fun onPause() {
        super.onPause()
    }

    // Application is in background.
    override fun onStop() {
        super.onStop()
    }

    // If you leave app and come back
    override fun onRestart() {
        super.onRestart()
    }

    // Kill the activity
    override fun onDestroy() {
        super.onDestroy()
    }

}
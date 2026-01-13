package com.example.lab_exam_two

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        // Wire up the only existing button in the XML
        val startBtn: Button = findViewById(R.id.getstartbtn)
        startBtn.setOnClickListener {
            // Change StartChallenges to the Activity you want to open first
            startActivity(Intent(this, HomeTo::class.java))
        }
    }
}

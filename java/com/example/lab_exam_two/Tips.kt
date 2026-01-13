package com.example.lab_exam_two

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tips)

        // Handle window insets for safe area padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Bottom navigation buttons
        val homeBtn: ImageButton = findViewById(R.id.home_btn)
        val challengeBtn: ImageButton = findViewById(R.id.challenge_btn)
        val tipsBtn: ImageButton = findViewById(R.id.bulb_btn)
        val productBtn: ImageButton = findViewById(R.id.product_btn)
        val profileBtn: ImageButton = findViewById(R.id.profile_btn)

        homeBtn.setOnClickListener {
            startActivity(Intent(this, HomeTo::class.java))
            finish()
        }

        challengeBtn.setOnClickListener {
            startActivity(Intent(this, StartChallenges::class.java))
            finish()
        }

        tipsBtn.setOnClickListener {
            // Only navigate if not already in Tips
            if (this !is Tips) {
                startActivity(Intent(this, Tips::class.java))
                finish()
            }
        }

        productBtn.setOnClickListener {
            startActivity(Intent(this, Products::class.java))
            finish()
        }

        profileBtn.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
            finish()
        }
    }
}

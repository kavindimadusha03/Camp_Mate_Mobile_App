package com.example.lab_exam_two

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartChallenges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_challenges)

        val tipsBtn: ImageButton = findViewById(R.id.bulb_btn)
        tipsBtn.setOnClickListener {
            val intent = Intent(this, Tips::class.java)
            startActivity(intent)
        }

        val productBtn: ImageButton = findViewById(R.id.product_btn)
        productBtn.setOnClickListener {
            val intent = Intent(this, Products::class.java)
            startActivity(intent)
        }

        val homeBtn: ImageButton = findViewById(R.id.home_btn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, HomeTo::class.java)
            startActivity(intent)
        }

        val challengeBtn: ImageButton = findViewById(R.id.challenge_btn)
        challengeBtn.setOnClickListener {
            val intent = Intent(this, StartChallenges::class.java)
            startActivity(intent)
        }

        val profileBtn: ImageButton = findViewById(R.id.profile_btn)
        profileBtn.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}

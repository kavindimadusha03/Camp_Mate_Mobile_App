package com.example.lab_exam_two

import android.content.Intent
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.widget.Button
// import androidx.activity.enableEdgeToEdge  // TEMP disabled to simplify first frame
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // TEMP: Detect any disk/network on UI thread during startup
        StrictMode.setThreadPolicy(
            ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build()
        )

        super.onCreate(savedInstanceState)

        // TEMP: disable edge-to-edge for faster first frame while we diagnose ANR
        // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Keep insets handling (safe with root view id = @id/main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to FeaturesPage
        val button: Button = findViewById(R.id.featuresbtn)
        button.setOnClickListener {
            startActivity(Intent(this, FeaturesPage::class.java))
        }
    }
}

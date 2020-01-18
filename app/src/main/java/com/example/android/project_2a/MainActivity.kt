package com.example.android.project_2a

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        var mockup1 = findViewById<Button>(R.id.mock_1)
        mockup1.setOnClickListener {
            val intent = Intent(this, IgActivity::class.java)
            startActivity(intent)
        }

        var mockup2 = findViewById<Button>(R.id.mock_2)
        mockup2.setOnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)
        }
    }
}

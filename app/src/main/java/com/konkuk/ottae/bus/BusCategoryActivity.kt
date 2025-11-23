package com.konkuk.ottae.bus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.konkuk.ottae.R

class BusCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_category)

        val btnFront = findViewById<Button>(R.id.btnFront)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnFront.setOnClickListener {
            val intent = Intent(this, BusArrivalActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, BusArrivalActivity::class.java)
            startActivity(intent)
        }
    }
}

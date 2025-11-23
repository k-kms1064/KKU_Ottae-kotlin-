package com.konkuk.ottae.bus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.konkuk.ottae.R

class BusCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_category)

        val btnFront = findViewById<Button>(R.id.btnFront)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnFront.setOnClickListener {
            Toast.makeText(this, "정문 버스 정보 준비중", Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            Toast.makeText(this, "후문 버스 정보 준비중", Toast.LENGTH_SHORT).show()
        }
    }
}

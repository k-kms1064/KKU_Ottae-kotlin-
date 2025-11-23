package com.konkuk.ottae

import com.konkuk.ottae.facility.FacilityCategoryActivity
import com.konkuk.ottae.favorite.FavoriteListActivity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import com.konkuk.ottae.bus.BusCategoryActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBus = findViewById<LinearLayout>(R.id.btnBus)
        val btnFacility = findViewById<LinearLayout>(R.id.btnFacility)
        val btnFavorites = findViewById<LinearLayout>(R.id.btnFavorites)

        btnBus.setOnClickListener {
            startActivity(Intent(this, BusCategoryActivity::class.java))
        }

        btnFacility.setOnClickListener {
            startActivity(Intent(this, FacilityCategoryActivity::class.java))
        }

        btnFavorites.setOnClickListener {
            startActivity(Intent(this, FavoriteListActivity::class.java))
        }
    }
}

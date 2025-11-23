package com.konkuk.ottae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.konkuk.ottae.bus.BusCategoryActivity
import com.konkuk.ottae.databinding.ActivityMainBinding
import com.konkuk.ottae.facility.FacilityCategoryActivity
import com.konkuk.ottae.favorite.FavoriteListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.busCard.setOnClickListener {
            val intent = Intent(this, BusCategoryActivity::class.java)
            startActivity(intent)
        }

        binding.facilityCard.setOnClickListener {
            val intent = Intent(this, FacilityCategoryActivity::class.java)
            startActivity(intent)
        }

        binding.favoriteCard.setOnClickListener {
            val intent = Intent(this, FavoriteListActivity::class.java)
            startActivity(intent)
        }
    }
}

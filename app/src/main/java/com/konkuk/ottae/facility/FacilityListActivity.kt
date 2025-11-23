package com.konkuk.ottae.facility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konkuk.ottae.R

class FacilityListActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView
    private val adapter = FacilityAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facility_list)

        recycler = findViewById(R.id.recyclerFacilities)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }
}

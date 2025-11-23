package com.konkuk.ottae.facility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konkuk.ottae.R

class FacilityListActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView
    private lateinit var adapter: FacilityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facility_list)

        recycler = findViewById(R.id.recyclerFacilities)
        recycler.layoutManager = LinearLayoutManager(this)

        // 개발 단계: 더미 데이터
        val dummyList = listOf(
            Facility("스타벅스", "카페"),
            Facility("홍콩반점", "중식"),
            Facility("오코노미야끼", "일식"),
            Facility("맘스터치", "버거")
        )

        adapter = FacilityAdapter(dummyList)
        recycler.adapter = adapter
    }
}

package com.konkuk.ottae.bus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konkuk.ottae.R

class BusArrivalActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView
    private lateinit var adapter: BusAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_arrival)

        recycler = findViewById(R.id.recyclerBusArrival)
        recycler.layoutManager = LinearLayoutManager(this)

        // 개발 초기 버전: 더미 데이터
        val dummyList = listOf(
            BusItem("600번", "5분 후 도착"),
            BusItem("500번", "10분 후 도착"),
            BusItem("700번", "곧 도착")
        )

        adapter = BusAdapter(dummyList)
        recycler.adapter = adapter
    }
}

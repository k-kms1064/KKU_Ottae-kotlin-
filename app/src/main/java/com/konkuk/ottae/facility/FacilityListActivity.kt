package com.konkuk.ottae.facility

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.ViewModelProvider
import com.konkuk.ottae.AppDatabase
import com.konkuk.ottae.R
import com.konkuk.ottae.favorite.FavoriteRepository
import com.konkuk.ottae.favorite.FavoriteViewModel
import com.konkuk.ottae.favorite.FavoriteViewModelFactory

class FacilityListActivity : AppCompatActivity() {

    private lateinit var viewModel: FavoriteViewModel
    private lateinit var adapter: FacilityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facility_list)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val txtTitle = findViewById<TextView>(R.id.txtTitle)

        btnBack.setOnClickListener { finish() }

        val category = intent.getStringExtra("category")
        if (category == null) {
            Toast.makeText(this, "카테고리를 찾을 수 없습니다.", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        txtTitle.text = category

        val recyclerView = findViewById<RecyclerView>(R.id.facilityRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val dao = AppDatabase.getDatabase(this).favoriteDao()
        val repository = FavoriteRepository(dao)
        viewModel = ViewModelProvider(
            this,
            FavoriteViewModelFactory(repository)
        )[FavoriteViewModel::class.java]

        val allFacilities = listOf(
            Facility(1, "엄마손분식", "한식"),
            Facility(2, "건국이네밥집", "한식"),
            Facility(3, "지뎅", "한식"),
            Facility(4, "단월 뚝배기", "한식"),
            Facility(5, "건대이모네순대국", "한식"),
            Facility(6, "오뚜기 부대찌개", "한식"),
            Facility(7, "안성가마솥순대국", "한식"),
            Facility(8, "쭈꾸대장", "한식"),
            Facility(9, "함지박", "한식"),

            Facility(10, "마라야", "중식"),
            Facility(11, "임소초", "중식"),
            Facility(12, "아트 단월", "중식"),
            Facility(13, "민씨본가", "중식"),
            Facility(14, "단월반점", "중식"),
            Facility(15, "마라순코우", "중식"),

            Facility(16, "아러이", "일식/돈까스"),
            Facility(17, "스시마당", "일식/돈까스"),

            Facility(18, "치킨마루", "치킨/피자"),
            Facility(19, "BHC치킨", "치킨/피자"),
            Facility(20, "짱돌", "치킨/피자"),
            Facility(21, "마리노피자", "치킨/피자"),

            Facility(22, "건대토스트", "버거"),
            Facility(23, "밀플랜비", "버거"),
            Facility(24, "맘스터치", "버거"),

            Facility(25, "분식나라", "분식"),
            Facility(26, "대박분식", "분식"),

            Facility(27, "메가MGC커피", "카페"),
            Facility(28, "컴포즈커피", "카페"),
            Facility(29, "소소, 단월", "카페"),
            Facility(30, "르비드", "카페"),
            Facility(31, "레스티오", "카페"),

            Facility(32, "GS25 충주건대학생회관점", "편의점"),
            Facility(33, "GS25 충주건대점", "편의점"),
            Facility(34, "CU 건대으뜸점", "편의점"),
            Facility(35, "세븐일레븐 충주건국대카페점", "편의점"),
            Facility(36, "GS25 충주단월원룸점", "편의점"),
            Facility(37, "이마트24 충주단월건대점", "편의점")
        )

        val filtered = allFacilities.filter { it.category == category }

        adapter = FacilityAdapter(filtered, viewModel)
        recyclerView.adapter = adapter
    }
}

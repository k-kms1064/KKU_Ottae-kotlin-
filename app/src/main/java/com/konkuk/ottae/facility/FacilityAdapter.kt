package com.konkuk.ottae.facility

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FacilityAdapter : RecyclerView.Adapter<FacilityAdapter.FacilityViewHolder>() {

    inner class FacilityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val view = View(parent.context)
        return FacilityViewHolder(view)
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 0
}

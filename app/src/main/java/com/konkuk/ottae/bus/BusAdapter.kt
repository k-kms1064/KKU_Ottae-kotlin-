package com.konkuk.ottae.bus

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BusAdapter : RecyclerView.Adapter<BusAdapter.BusViewHolder>() {

    inner class BusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusViewHolder {

        val view = View(parent.context)
        return BusViewHolder(view)
    }

    override fun onBindViewHolder(holder: BusViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 0
}

package com.konkuk.ottae.bus

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleBusAdapter : RecyclerView.Adapter<SimpleBusAdapter.SimpleBusViewHolder>() {

    inner class SimpleBusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleBusViewHolder {
        val view = View(parent.context)
        return SimpleBusViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimpleBusViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 0
}

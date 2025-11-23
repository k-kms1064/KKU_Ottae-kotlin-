package com.konkuk.ottae.bus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konkuk.ottae.R

class BusAdapter(private val items: List<BusItem>) :
    RecyclerView.Adapter<BusAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtRouteName: TextView = itemView.findViewById(R.id.txtRouteName)
        val txtArrivalTime: TextView = itemView.findViewById(R.id.txtArrivalTime)
        val txtDirection: TextView = itemView.findViewById(R.id.txtDirection)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_bus_arrival, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.txtRouteName.text = item.routeName
        holder.txtArrivalTime.text = "약 ${item.minutes}분 후"
        holder.txtDirection.text = "${item.stopsAway}정류장 전 · ${item.direction}"
    }

    override fun getItemCount(): Int = items.size
}

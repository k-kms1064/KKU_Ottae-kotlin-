package com.konkuk.ottae.facility

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.konkuk.ottae.favorite.FavoriteViewModel
import com.konkuk.ottae.favorite.FavoriteEntity
import com.konkuk.ottae.R

class FacilityAdapter(
    private val facilities: List<Facility>,
    private val viewModel: FavoriteViewModel
) : RecyclerView.Adapter<FacilityAdapter.FacilityViewHolder>() {

    class FacilityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameText: TextView = itemView.findViewById(R.id.facilityNameText)
        val favoriteIcon: ImageView = itemView.findViewById(R.id.favoriteIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.facility_item, parent, false)
        return FacilityViewHolder(view)
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        val facility = facilities[position]

        holder.nameText.text = facility.name

        viewModel.isFavorite(facility.id) { isFav ->
            val icon = if (isFav) R.drawable.ic_favorite_filled else R.drawable.ic_favorite_border
            holder.favoriteIcon.setImageResource(icon)
        }

        holder.favoriteIcon.setOnClickListener {
            viewModel.isFavorite(facility.id) { isFav ->
                if (isFav) {
                    viewModel.removeFavorite(FavoriteEntity(facility.id, facility.name))
                    holder.favoriteIcon.setImageResource(R.drawable.ic_favorite_border)
                } else {
                    viewModel.addFavorite(FavoriteEntity(facility.id, facility.name))
                    holder.favoriteIcon.setImageResource(R.drawable.ic_favorite_filled)
                }
            }
        }
    }

    override fun getItemCount(): Int = facilities.size
}

package com.konkuk.ottae.favorite

import android.content.Context
import androidx.room.Room
import com.konkuk.ottae.AppDatabase

class FavoriteRepository(context: Context) {

    private val db: AppDatabase = Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java,
        "favorite-db"
    ).build()

    private val dao = db.favoriteDao()

    fun getFavorites(): List<FavoriteEntity> {
        return emptyList()
    }

    fun addFavorite(item: FavoriteEntity) {

    }

    fun removeFavorite(item: FavoriteEntity) {

    }
}

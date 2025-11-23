package com.konkuk.ottae

import androidx.room.Database
import androidx.room.RoomDatabase
import com.konkuk.ottae.favorite.FavoriteDao
import com.konkuk.ottae.favorite.FavoriteEntity

@Database(entities = [FavoriteEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
}

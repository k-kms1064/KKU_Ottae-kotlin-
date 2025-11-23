package com.konkuk.ottae

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

import com.konkuk.ottae.favorite.FavoriteEntity
import com.konkuk.ottae.favorite.FavoriteDao

@Database(
    entities = [FavoriteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun favoriteDao(): FavoriteDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "ottae_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

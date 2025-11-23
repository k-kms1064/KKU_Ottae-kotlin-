package com.konkuk.ottae.favorite

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FavoriteDao {

    @Query("SELECT * FROM FavoriteEntity")
    fun getAll(): List<FavoriteEntity>

    @Insert
    fun insert(item: FavoriteEntity)
}

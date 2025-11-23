package com.konkuk.ottae.favorite

class FavoriteRepository(private val dao: FavoriteDao) {

    suspend fun addFavorite(favorite: FavoriteEntity) {
        dao.insertFavorite(favorite)
    }

    suspend fun removeFavorite(favorite: FavoriteEntity) {
        dao.deleteFavorite(favorite)
    }

    suspend fun getAllFavorites(): List<FavoriteEntity> {
        return dao.getAllFavorites()
    }

    suspend fun isFavorite(facilityId: Int): Boolean {
        return dao.getFavoriteByFacilityId(facilityId) != null
    }
}

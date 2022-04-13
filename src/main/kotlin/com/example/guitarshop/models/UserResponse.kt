package com.example.guitarshop.models

import com.example.guitarshop.entity.FavoriteEntity
import com.example.guitarshop.entity.ShoppingBagEntity


data class UserResponse(
    val email: String,
    val role: String,
    val favs: List<FavoriteEntity> = emptyList(),
    val bags: List<ShoppingBagEntity> = emptyList()
)

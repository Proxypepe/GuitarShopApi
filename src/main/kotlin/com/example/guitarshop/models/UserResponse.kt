package com.example.guitarshop.models

import com.example.guitarshop.entity.ShoppingBagEntity


data class UserResponse(
    val email: String,
    val role: String,
    val bags: List<ShoppingBagEntity> = emptyList()
)
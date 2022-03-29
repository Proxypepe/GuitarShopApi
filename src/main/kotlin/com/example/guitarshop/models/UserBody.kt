package com.example.guitarshop.models

import com.example.guitarshop.entity.ShoppingBagEntity
import io.swagger.v3.oas.annotations.Parameter


data class UserBody(
    @Parameter(required = true)
    val email: String,
    @Parameter(required = false)
    val password: String?,
)

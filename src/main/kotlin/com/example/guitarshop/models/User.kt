package com.example.guitarshop.models

import com.example.guitarshop.dto.ShoppingBagDTO
import io.swagger.v3.oas.annotations.Parameter


data class User(
    @Parameter(required = true)
    val email: String,
    @Parameter(required = false)
    val password: String?,
    @Parameter(required = true)
    val role: String,
    @Parameter(required = false)
    val requestDTOS: List<ShoppingBagDTO> = emptyList()
)

package com.example.guitarshop.models

import com.example.guitarshop.dto.ProductDTO
import io.swagger.v3.oas.annotations.Parameter

data class ShoppingBag (
    @Parameter(required = true)
    val products: List<ProductDTO>,
    @Parameter(required = true)
    val amount: Int,
    @Parameter(required = true)
    val user_id: Int,
    @Parameter(required = true)
    val price: Int
)
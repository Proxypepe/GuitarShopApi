package com.example.guitarshop.models

import com.example.guitarshop.entity.ProductEntity
import io.swagger.v3.oas.annotations.Parameter

data class ShoppingBag (
    @Parameter(required = true)
    val products: List<ProductEntity>,
    @Parameter(required = true)
    val amount: Int,
    @Parameter(required = true)
    val user_id: Int,
    @Parameter(required = true)
    val price: Int
)
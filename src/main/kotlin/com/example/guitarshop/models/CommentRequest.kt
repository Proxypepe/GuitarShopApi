package com.example.guitarshop.models

import com.example.guitarshop.entity.ProductEntity
import com.example.guitarshop.entity.UserEntity

data class CommentRequest(
    val comment: String?,
    val advantages: String?,
    val disadvantages: String?,
    val rating: Float,
    val commentedProduct: ProductEntity,
    val commentedByUser: UserEntity
)


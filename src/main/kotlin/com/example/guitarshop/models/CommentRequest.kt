package com.example.guitarshop.models

import com.example.guitarshop.entity.ProductEntity
import com.example.guitarshop.entity.UserEntity

data class CommentRequest(
    val comment: String,
    val product: ProductEntity,
    val user: UserEntity
)


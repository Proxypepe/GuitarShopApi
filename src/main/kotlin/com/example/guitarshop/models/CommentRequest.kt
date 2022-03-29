package com.example.guitarshop.models

data class CommentRequest(
    val comment: String,
    val product_id: Int,
    val user_id: Int
)


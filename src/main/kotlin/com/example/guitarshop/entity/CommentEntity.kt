package com.example.guitarshop.entity

import javax.persistence.*

@Table(name = "comments")
@Entity
data class CommentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,
    @Column(length = 1024)
    val comment: String,

    val product_id: Int,
    val user_id: Int,
)
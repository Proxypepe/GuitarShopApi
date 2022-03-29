package com.example.guitarshop.entity

import javax.persistence.*

@Table(name = "raitings")
@Entity
data class RatingEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,
    val rating: Float,
    val product_id: Int,
    val user_id: Int

    )
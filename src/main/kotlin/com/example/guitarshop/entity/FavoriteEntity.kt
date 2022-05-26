package com.example.guitarshop.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Table(name = "favorite")
@Entity
data class FavoriteEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    val user: UserEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonBackReference
    val product: ProductEntity

)
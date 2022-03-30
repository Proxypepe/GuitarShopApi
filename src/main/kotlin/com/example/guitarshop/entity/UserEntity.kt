package com.example.guitarshop.entity

import javax.persistence.*

@Table(name = "users")
@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val userId: Long = 0,
    val email: String,
    val password: String?,
    val role: String,

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    val bags: List<ShoppingBagEntity> = emptyList(),

    @OneToMany(mappedBy = "user")
    val comments: List<CommentEntity> = emptyList(),

    @OneToMany(mappedBy = "user")
    val rating: List<RatingEntity> = emptyList(),

    @OneToMany(mappedBy = "user")
    val favorites: List<FavoriteEntity> = emptyList(),
    )

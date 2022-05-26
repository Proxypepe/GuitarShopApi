package com.example.guitarshop.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
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
    @JsonManagedReference
    val bags: List<ShoppingBagEntity> = emptyList(),

    @OneToMany(mappedBy = "commentedByUser")
    @JsonManagedReference
    val comments: List<CommentEntity> = emptyList(),

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    val favorites: List<FavoriteEntity> = emptyList(),
)

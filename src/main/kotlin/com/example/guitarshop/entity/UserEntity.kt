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

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    val comments: List<CommentEntity> = emptyList(),

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    val rating: List<RatingEntity> = emptyList(),

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "prod_id")
    @Column(nullable = true)
    val favorites: List<ProductEntity> = emptyList(),
    )

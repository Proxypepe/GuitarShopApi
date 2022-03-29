package com.example.guitarshop.entity

import javax.persistence.*

@Table(name = "shopping_bag")
@Entity
data class ShoppingBagEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val bagId: Long = 0,
    val user_id: Int,
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "prod_id")
    @Column(nullable = true)
    val products: List<ProductEntity> = emptyList(),
    val amount: Int,
    val price: Int
)
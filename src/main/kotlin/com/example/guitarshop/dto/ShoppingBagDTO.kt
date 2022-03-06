package com.example.guitarshop.dto

import javax.persistence.*

@Table(name = "shopping_bag")
@Entity
data class ShoppingBagDTO(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val bagId: Long = 0,
    val user_id: Int,
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "vendor_code")
    val products: List<ProductDTO>,
    val amount: Int,
    val price: Int
)
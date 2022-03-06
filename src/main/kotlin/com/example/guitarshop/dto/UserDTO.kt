package com.example.guitarshop.dto

import javax.persistence.*

@Table(name = "users")
@Entity
data class UserDTO(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val userId: Long = 0,
    val email: String,
    val password: String?,
    val role: String,
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    val bags: List<ShoppingBagDTO> = emptyList()
)
package com.example.guitarshop.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Table(name = "comments")
@Entity
data class CommentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,
    @Column(length = 1024)
    val comment: String?,
    @Column(length = 1024)
    val advantages: String?,
    @Column(length = 1024)
    val disadvantages: String?,

    val rating: Float,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonBackReference
    val commentedProduct: ProductEntity,

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    val commentedByUser: UserEntity,
)
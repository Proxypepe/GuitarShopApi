package com.example.guitarshop.entity

import javax.persistence.*

@Table(name = "products")
@Entity
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val prod_id: Int = 0,
    @Column(length = 1023)
    val name: String,
    @Column(length = 2047)
    val description: String,
    @Column(length = 63)
    val price: String,
    val stock: Int,
    @Column(length = 100)
    val category: String,
    @Column(length = 100)
    val brand: String,
    val shell_type: String?,
    val top_deck: String?,
    val top_material: String?,
    val back_deck: String?,
    val neck_material: String?,
    val overlay: String?,
    @Column(length = 10)
    val strings: String?,
    val neck_attachment: String?,
    val mensura: String?,
    val neck_width: String?,
    val color: String?,
    val tailpiece: String?,
    val produced: String?,
    val cutout: String?,
    val varnish: String?,
    val form: String?,
    val specials: String?,
    val lads: String?,
    val link: String?,
    @OneToMany(fetch = FetchType.EAGER)
    val bags: List<ShoppingBagEntity> = emptyList(),

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    val comments: List<CommentEntity> = emptyList(),

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    val rating: List<RatingEntity> = emptyList(),

    @OneToMany(fetch = FetchType.EAGER)
    val favoriteBy: List<UserEntity> = emptyList(),
    )

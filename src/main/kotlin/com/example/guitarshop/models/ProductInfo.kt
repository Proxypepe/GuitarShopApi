package com.example.guitarshop.models

import com.example.guitarshop.entity.CommentEntity
import com.example.guitarshop.entity.ProductEntity
import com.example.guitarshop.entity.RatingEntity

data class ProductInfo(
    val prod_id: Int = 0,
    val name: String,
    val description: String,
    val price: String,
    val stock: Int,
    val category: String,
    val brand: String,
    val shell_type: String?,
    val top_deck: String?,
    val top_material: String?,
    val back_deck: String?,
    val neck_material: String?,
    val overlay: String?,
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
    val comments: List<CommentEntity>,
    val rating: List<RatingEntity>
)

fun toProductInfo(productEntity: ProductEntity): ProductInfo {
    return ProductInfo(
        prod_id = productEntity.prod_id,
        name = productEntity.name,
        description = productEntity.description,
        price = productEntity.price,
        stock = productEntity.stock,
        category = productEntity.category,
        brand = productEntity.brand,
        shell_type = productEntity.shell_type,
        top_deck = productEntity.top_deck,
        top_material= productEntity.top_material,
        back_deck = productEntity.back_deck,
        neck_material = productEntity.neck_material,
        overlay = productEntity.overlay,
        strings = productEntity.strings,
        neck_attachment = productEntity.neck_attachment,
        mensura = productEntity.mensura,
        neck_width = productEntity.neck_width,
        color = productEntity.color,
        tailpiece = productEntity.tailpiece,
        produced = productEntity.produced,
        cutout = productEntity.cutout,
        varnish = productEntity.varnish,
        form = productEntity.form,
        specials= productEntity.specials,
        lads = productEntity.lads,
        link = productEntity.link,
        comments = productEntity.comments,
        rating = productEntity.rating
    )
}

fun toProductInfoList(productEntities: List<ProductEntity>): List<ProductInfo> {
    val res: MutableList<ProductInfo> = mutableListOf()
    for (product in productEntities){
        res += toProductInfo(product)
    }
    return res
}
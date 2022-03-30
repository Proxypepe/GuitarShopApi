package com.example.guitarshop.controllers

import com.example.guitarshop.entity.ProductEntity
import com.example.guitarshop.service.ProductService
import org.springframework.web.bind.annotation.*

// Tested
@RestController
@RequestMapping("/products")
class ProductController(private val service: ProductService) {
    @GetMapping("/all")
    fun getAllProducts(): List<ProductEntity> = service.getProducts()

    @GetMapping("/detail/{id}")
    fun getDetailedInformation(@PathVariable id: Int): ProductEntity = service.getProductById(id)

    @GetMapping("/range")
    fun getRangeProducts(@RequestParam offset: Int , @RequestParam limit: Int): List<ProductEntity> =
        service.getProductWithOffset(offset, limit)

}
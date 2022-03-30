package com.example.guitarshop.controllers

import com.example.guitarshop.models.ProductInfo
import com.example.guitarshop.service.ProductService
import org.springframework.web.bind.annotation.*

// Tested
@RestController
@RequestMapping("/products")
class ProductController(private val service: ProductService) {
    @GetMapping("/all")
    fun getAllProducts(): List<ProductInfo> = service.getProducts()

    @GetMapping("/detail/{id}")
    fun getDetailedInformation(@PathVariable id: Int): ProductInfo = service.getProductById(id)

    @GetMapping("/range")
    fun getRangeProducts(@RequestParam offset: Int , @RequestParam limit: Int): List<ProductInfo> =
        service.getProductWithOffset(offset, limit)

}
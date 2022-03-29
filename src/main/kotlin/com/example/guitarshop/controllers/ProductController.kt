package com.example.guitarshop.controllers

import com.example.guitarshop.entity.ProductEntity
import com.example.guitarshop.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/products/")
class ProductController(private val service: ProductService) {
    @GetMapping("/all")
    fun getAllRequest(): List<ProductEntity> = service.getProducts()

    @GetMapping("/{id}")
    fun getDetailedInformation(@PathVariable id: Int): ProductEntity = service.getProductById(id)
}
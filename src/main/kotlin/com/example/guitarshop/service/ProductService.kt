package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.ProductRepository
import com.example.guitarshop.entity.ProductEntity
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun save(productEntity: ProductEntity): ProductEntity = productRepository.save(productEntity)
    fun getProducts(): List<ProductEntity> = productRepository.findAll()

    fun getProductById(vendorCode: Int): ProductEntity = productRepository.getById(vendorCode)
}
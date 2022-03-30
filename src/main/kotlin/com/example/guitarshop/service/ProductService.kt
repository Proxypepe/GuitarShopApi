package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.ProductRepository
import com.example.guitarshop.entity.ProductEntity
import com.example.guitarshop.models.ProductInfo
import com.example.guitarshop.models.toProductInfo
import com.example.guitarshop.models.toProductInfoList
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun save(productEntity: ProductEntity): ProductEntity = productRepository.save(productEntity)
    fun getProducts(): List<ProductInfo> = toProductInfoList(productRepository.findAll())

    fun getProductById(id: Int): ProductInfo = toProductInfo(productRepository.getById(id))

    fun getProductWithOffset(offset: Int, limit: Int): List<ProductInfo>
    = toProductInfoList(productRepository.getProductWithOffset(offset, limit))
}
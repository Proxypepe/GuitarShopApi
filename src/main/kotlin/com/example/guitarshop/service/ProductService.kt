package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.ProductRepository
import com.example.guitarshop.dto.ProductDTO
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun save(productDTO: ProductDTO): ProductDTO = productRepository.save(productDTO)
    fun getProducts(): List<ProductDTO> = productRepository.findAll()

    fun getProductByVendorCode(vendorCode: Int): ProductDTO = productRepository.getById(vendorCode)
}
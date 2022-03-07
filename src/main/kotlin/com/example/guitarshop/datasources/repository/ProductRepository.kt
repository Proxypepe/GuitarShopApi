package com.example.guitarshop.datasources.repository

import com.example.guitarshop.dto.ProductDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<ProductDTO, Int> {

}
package com.example.guitarshop.datasources.repository

import com.example.guitarshop.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<ProductEntity, Int> {

    @Query("SELECT * FROM products ORDER BY products.prod_id OFFSET ?1 LIMIT ?2", nativeQuery = true)
    fun getProductWithOffset(offset: Int, limit: Int): List<ProductEntity>

}
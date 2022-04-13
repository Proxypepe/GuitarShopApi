package com.example.guitarshop.datasources.repository

import com.example.guitarshop.entity.RatingEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface RatingRepository : JpaRepository<RatingEntity, Int> {

    @Query("SELECT * FROM ratings WHERE ratings.product_id = ?1", nativeQuery = true)
    fun findRatingEntityByProductId(prod_id: Int)

}
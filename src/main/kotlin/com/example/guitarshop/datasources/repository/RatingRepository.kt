package com.example.guitarshop.datasources.repository;

import com.example.guitarshop.entity.RatingEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RatingRepository : JpaRepository<RatingEntity, Int> {
}
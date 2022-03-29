package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.RatingRepository
import com.example.guitarshop.entity.RatingEntity
import org.springframework.stereotype.Service

@Service
class RatingService(private val ratingRepository: RatingRepository) {
    fun save(ratingEntity: RatingEntity) = ratingRepository.save(ratingEntity)


}
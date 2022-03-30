package com.example.guitarshop.controllers

import com.example.guitarshop.entity.RatingEntity
import com.example.guitarshop.service.RatingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rating/")
class RatingController(private val service: RatingService) {

    @PostMapping("/add")
    fun createRating(@RequestBody body: RatingEntity): RatingEntity {
        return service.save(
            RatingEntity(
                product = body.product,
                user = body.user,
                rating = body.rating
            )
        )
    }
}
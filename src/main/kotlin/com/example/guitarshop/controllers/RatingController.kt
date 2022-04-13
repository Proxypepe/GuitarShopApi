package com.example.guitarshop.controllers

import com.example.guitarshop.entity.RatingEntity
import com.example.guitarshop.service.RatingService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rating/")
class RatingController(private val service: RatingService) {

    @GetMapping("/detail/{id}")
    fun getDetailedRating(@PathVariable id: Int) = service.getRatingByProdId(id)

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
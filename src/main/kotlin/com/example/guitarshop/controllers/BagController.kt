package com.example.guitarshop.controllers

import com.example.guitarshop.entity.ShoppingBagEntity
import com.example.guitarshop.models.ShoppingBag
import com.example.guitarshop.service.ShoppingBagService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/bag/")
class BagController(private val service: ShoppingBagService) {
    @PostMapping("/add")
    fun createBag(@RequestBody body: ShoppingBag): ShoppingBagEntity {
        return service.save(
            ShoppingBagEntity(
                user_id = body.user_id,
                products = body.products,
                amount = body.amount,
                price = body.price
            )
        )
    }
}

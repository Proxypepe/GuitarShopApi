package com.example.guitarshop.controllers

import com.example.guitarshop.dto.ShoppingBagDTO
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
@Tag(name = "Shopping bags endpoints")
class BagController(private val service: ShoppingBagService) {
    @PostMapping("/add")
    @Operation(summary = "Creates a new shopping bag", method = "Post")
    @ApiResponses(
        ApiResponse(
            responseCode = "200", content =
            arrayOf(
                Content(
                    mediaType = "application/json",
                    schema = Schema(implementation = ShoppingBagDTO::class)
                )
            )
        )
    )
    fun createBag(@RequestBody body: ShoppingBag): ShoppingBagDTO {
        return service.save(
            ShoppingBagDTO(
                user_id = body.user_id,
                products = body.products,
                amount = body.amount,
                price = body.price
            )
        )
    }

}
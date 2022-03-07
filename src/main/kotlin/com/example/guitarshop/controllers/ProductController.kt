package com.example.guitarshop.controllers

import com.example.guitarshop.dto.ProductDTO
import com.example.guitarshop.service.ProductService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products/")
class ProductController(private val service: ProductService) {
    @GetMapping("/all")
    @Operation(summary = "Get information about all products")
    @ApiResponses(
        ApiResponse(
            responseCode = "200", description = "Found the products", content =
            arrayOf(
                Content(
                    mediaType = "application/json",
                    array = ArraySchema(schema = Schema(implementation = ProductDTO::class))
                )
            )
        )
    )
    fun getAllRequest(): List<ProductDTO> = service.getProducts()

    @GetMapping("/{vendor_code}")
    @Operation(summary = "Get detailed information about product")
    @ApiResponses(
        ApiResponse(
            responseCode = "200", description = "Found the product", content =
                arrayOf(
                    Content(
                        mediaType = "application/json",
                        array = ArraySchema(schema = Schema(implementation = ProductDTO::class))
                    )
                )
        )
    )
    fun getDetailedInformation(@PathVariable vendor_code: Int): ProductDTO = service.getProductByVendorCode(vendor_code)
}
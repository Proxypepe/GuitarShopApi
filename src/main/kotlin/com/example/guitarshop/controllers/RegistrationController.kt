package com.example.guitarshop.controllers

import com.example.guitarshop.dto.UserDTO
import com.example.guitarshop.models.User
import com.example.guitarshop.service.UserService
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
@RequestMapping("/register")
@Tag(name = "Registration endpoint")
class RegistrationController(private val service: UserService) {

    @PostMapping
    @Operation(summary = "Creates a new user", method = "Post")
    @ApiResponses(
        ApiResponse(
            responseCode = "200", description = "Authorizes the user", content =
            arrayOf(
                Content(
                    mediaType = "application/json",
                    schema = Schema(implementation = UserDTO::class)
                )
            )
        )
    )
    fun createUser(@RequestBody body: User): UserDTO {
        return service.save(
            UserDTO(
                email = body.email,
                password = body.password,
                role = body.role
            )
        )
    }

}
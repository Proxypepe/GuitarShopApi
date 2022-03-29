package com.example.guitarshop.controllers

import com.example.guitarshop.models.UserBody
import com.example.guitarshop.models.UserResponse
import com.example.guitarshop.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth")
class AuthController(private val service: UserService) {
    @PostMapping()
    fun checkAuth(@RequestBody body: UserBody): UserResponse? {
        val user = service.getUserByEmail(body.email)
        if (user.password == body.password)
            return UserResponse(
                email = user.email,
                role = user.role,
                bags = user.bags,
            )
        return null
    }
}

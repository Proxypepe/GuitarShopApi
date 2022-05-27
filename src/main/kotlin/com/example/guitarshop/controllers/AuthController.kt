package com.example.guitarshop.controllers

import com.example.guitarshop.entity.UserEntity
import com.example.guitarshop.models.UserBody
import com.example.guitarshop.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth")
class AuthController(private val service: UserService) {
    @PostMapping
    fun checkAuth(@RequestBody body: UserBody): UserEntity? {
        val user = service.getUserByEmail(body.email)
        if (user.password == body.password)
            return user
        return null
    }
}

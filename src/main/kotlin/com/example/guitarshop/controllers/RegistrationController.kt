package com.example.guitarshop.controllers

import com.example.guitarshop.entity.UserEntity
import com.example.guitarshop.models.UserBody
import com.example.guitarshop.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/register")
class RegistrationController(private val service: UserService) {

    @PostMapping
    fun createUser(@RequestBody body: UserBody): UserEntity {
        return service.save(
            UserEntity(
                email = body.email,
                password = body.password,
                role = "1"
            )
        )
    }
}
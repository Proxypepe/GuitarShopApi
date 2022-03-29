package com.example.guitarshop.controllers

import com.example.guitarshop.entity.CommentEntity
import com.example.guitarshop.models.CommentRequest
import com.example.guitarshop.service.CommentService
import io.swagger.v3.oas.annotations.parameters.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/comments/")
class CommentController(private val service: CommentService) {

    @PostMapping("add/")
    @RequestBody
    fun createComment(@RequestBody body: CommentRequest) {
        service.save(CommentEntity(
            comment = body.comment,
            product_id = body.product_id,
            user_id = body.user_id
        ))
    }

}
package com.example.guitarshop.controllers

import com.example.guitarshop.entity.CommentEntity
import com.example.guitarshop.models.CommentRequest
import com.example.guitarshop.service.CommentService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/comments")
class CommentController(private val service: CommentService) {

    @PostMapping("/add", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun createComment(@RequestBody body: CommentRequest): CommentEntity {
        println(body)
        return service.save(
            CommentEntity(
                comment = body.comment,
                advantages = body.advantages,
                disadvantages = body.disadvantages,
                rating = body.rating,
                commentedProduct = body.commentedProduct,
                commentedByUser = body.commentedByUser
            )
        )
    }
}

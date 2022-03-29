package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.CommentRepository
import com.example.guitarshop.entity.CommentEntity
import org.springframework.stereotype.Service

@Service
class CommentService(private val commentRepository: CommentRepository) {
    fun save(commentEntity: CommentEntity) = commentRepository.save(commentEntity)

}
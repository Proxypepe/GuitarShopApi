package com.example.guitarshop.datasources.repository;

import com.example.guitarshop.entity.CommentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository : JpaRepository<CommentEntity, Int> {
}
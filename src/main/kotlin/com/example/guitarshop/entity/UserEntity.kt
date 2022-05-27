package com.example.guitarshop.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Table(name = "users")
@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val userId: Long = 0,
    val email: String,
    val password: String?,
    val role: String,

    @OneToMany(mappedBy = "commentedByUser", cascade = [(CascadeType.ALL)])
    @JsonManagedReference(value = "user_comments")
    val comments: List<CommentEntity> = emptyList(),

)

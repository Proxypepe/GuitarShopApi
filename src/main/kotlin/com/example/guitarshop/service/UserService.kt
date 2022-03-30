package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.UserRepository
import com.example.guitarshop.entity.UserEntity
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun save(user: UserEntity) : UserEntity = userRepository.save(user)

    fun getUserById(id: Long): UserEntity = userRepository.getById(id)
    fun getUsers(): List<UserEntity> = userRepository.findAll()

    fun getUserByEmail(email: String): UserEntity = userRepository.getUserDTOByEmail(email)

    fun deleteFavorite(id: Int) {

    }

}
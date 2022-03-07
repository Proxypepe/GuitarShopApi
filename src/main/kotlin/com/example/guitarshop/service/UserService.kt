package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.UserRepository
import com.example.guitarshop.dto.UserDTO
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun save(user: UserDTO) : UserDTO = userRepository.save(user)

    fun getUserById(id: Long): UserDTO = userRepository.getById(id)
    fun getUsers(): List<UserDTO> = userRepository.findAll()

    fun getUserByEmail(email: String): UserDTO = userRepository.getUserDTOByEmail(email)

}
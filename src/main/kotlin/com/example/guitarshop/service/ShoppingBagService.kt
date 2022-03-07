package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.ShoppingBagRepository
import com.example.guitarshop.dto.ShoppingBagDTO
import org.springframework.stereotype.Service

@Service
class ShoppingBagService(private val shoppingBagRepository: ShoppingBagRepository){

    fun save(user: ShoppingBagDTO) : ShoppingBagDTO = shoppingBagRepository.save(user)
    fun getAll(): List<ShoppingBagDTO> = shoppingBagRepository.findAll()

}
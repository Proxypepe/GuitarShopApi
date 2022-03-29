package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.ShoppingBagRepository
import com.example.guitarshop.entity.ShoppingBagEntity
import org.springframework.stereotype.Service

@Service
class ShoppingBagService(private val shoppingBagRepository: ShoppingBagRepository){

    fun save(user: ShoppingBagEntity) : ShoppingBagEntity = shoppingBagRepository.save(user)
    fun getAll(): List<ShoppingBagEntity> = shoppingBagRepository.findAll()

}
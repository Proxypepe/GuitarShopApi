package com.example.guitarshop.service

import com.example.guitarshop.datasources.repository.FavoriteRepository
import com.example.guitarshop.entity.FavoriteEntity
import org.springframework.stereotype.Service

@Service
class FavoriteService(private val favoriteRepository: FavoriteRepository) {
    fun save(favoriteEntity: FavoriteEntity) = favoriteRepository.save(favoriteEntity)
    fun getAll(): MutableList<FavoriteEntity> = favoriteRepository.findAll()
    fun deleteById(id: Long) = favoriteRepository.deleteById(id)

}
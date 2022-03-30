package com.example.guitarshop.controllers

import com.example.guitarshop.entity.FavoriteEntity
import com.example.guitarshop.entity.UserEntity
import com.example.guitarshop.service.FavoriteService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/favorite")
class FavoriteController(private val service: FavoriteService) {

    @PostMapping("/add")
    fun addFavorite(@RequestBody body: FavoriteEntity): FavoriteEntity = service.save(body)

    @DeleteMapping("/delete/{id}")
    fun deleteFavorite(@PathVariable id: Long) = service.deleteById(id)

}
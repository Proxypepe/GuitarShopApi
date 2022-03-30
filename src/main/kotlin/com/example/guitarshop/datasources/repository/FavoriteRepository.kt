package com.example.guitarshop.datasources.repository;

import com.example.guitarshop.entity.FavoriteEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FavoriteRepository : JpaRepository<FavoriteEntity, Long> {

}
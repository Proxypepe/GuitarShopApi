package com.example.guitarshop.datasources.repository

import com.example.guitarshop.entity.ShoppingBagEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingBagRepository : JpaRepository<ShoppingBagEntity, Long> {

}
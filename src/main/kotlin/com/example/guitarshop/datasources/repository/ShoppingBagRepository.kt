package com.example.guitarshop.datasources.repository

import com.example.guitarshop.dto.ShoppingBagDTO
import org.springframework.data.jpa.repository.JpaRepository

interface ShoppingBagRepository : JpaRepository<ShoppingBagDTO, Long> {

}
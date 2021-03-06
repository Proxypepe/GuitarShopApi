package com.example.guitarshop.datasources.repository

import com.example.guitarshop.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, Long> {

    @Query ("select * from users where email = ?1", nativeQuery = true)
    fun getUserDTOByEmail(email: String): UserEntity

}
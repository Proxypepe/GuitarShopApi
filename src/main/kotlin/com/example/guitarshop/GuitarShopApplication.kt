package com.example.guitarshop

import com.example.guitarshop.config.SwaggerConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
@Import(SwaggerConfiguration::class)
class GuitarShopApplication

fun main(args: Array<String>) {
    SpringApplication.run(GuitarShopApplication::class.java, *args)
}

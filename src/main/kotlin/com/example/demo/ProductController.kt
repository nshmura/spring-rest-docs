package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/products")
@RestController
class ProductController {

    @GetMapping("")
    fun list(): List<Product> {
        return listOf(Product(1, "A"), Product(2, "B"))
    }
}

class Product(
    val id: Int,
    val name: String
)

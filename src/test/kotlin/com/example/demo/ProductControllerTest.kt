package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(ProductController::class)
@AutoConfigureRestDocs
class ProductControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun list() {
        mockMvc
            .perform(get("/products"))
            .andDo(document("products/{methodName}"))
            .andExpect(status().isOk)
    }
}
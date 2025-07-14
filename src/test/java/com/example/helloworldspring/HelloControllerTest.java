package com.example.helloworldspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloWorld() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello-world"));
    }

    @Test
    void shouldReturnSquareOfNumber() throws Exception {
        mockMvc.perform(get("/square").param("number", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("25"));
    }

    @Test
    void shouldReturnSquareOfZero() throws Exception {
        mockMvc.perform(get("/square").param("number", "0"))
                .andExpect(status().isOk())
                .andExpect(content().string("0"));
    }

    @Test
    void shouldReturnSquareOfNegativeNumber() throws Exception {
        mockMvc.perform(get("/square").param("number", "-3"))
                .andExpect(status().isOk())
                .andExpect(content().string("9"));
    }
}
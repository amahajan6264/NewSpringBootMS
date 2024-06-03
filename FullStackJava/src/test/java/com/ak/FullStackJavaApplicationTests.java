package com.ak;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.ak.controller.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(HomeController.class)
public class FullStackJavaApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWithName() throws Exception {
        mockMvc.perform(get("/api/jobs"))
            .andExpect(status().isOk());
    }

	/*
	 * @Test public void helloWithoutName() throws Exception {
	 * mockMvc.perform(get("/hello")) .andExpect(status().isOk())
	 * .andExpect(content().string("Hello, World!")); }
	 */
}


package com.github.Evgenn91.eduka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(HealthController.class) // - тут создается тестовый экземпляр контроллера!(поднимается веб контекст спринга - но в данном случае создается только контроллер HealthController раз кго только указали)
public class HealthControllerTest {
    @Autowired
    private MockMvc mockMvc; // имитатор http запросов

    void shouldReturnOkForHealthEndpoint() throws Exception {
        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(content().string("health"));
    }
}

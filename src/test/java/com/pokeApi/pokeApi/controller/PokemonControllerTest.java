package com.pokeApi.pokeApi.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class PokemonControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    public void testHelloEndpointIsOK() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk());
    }
    @Test
    public void testPokemonEndpointIsOK() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/allPokemon"))
                .andExpect(status().isOk());
    }


}

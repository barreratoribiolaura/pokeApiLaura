package com.pokeApi.pokeApi.service;

import com.pokeApi.pokeApi.model.PokemonResultDetailEntity;
import com.pokeApi.pokeApi.model.PokemonResultEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class PokemonServiceTest {
    @InjectMocks
    PokemonServiceImp pokemonService;
    @Mock
    RestTemplate restTemplate;
    @Test
    void testRest(){
        Mockito.when(restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon",PokemonResultEntity.class))
                .thenReturn(new PokemonResultEntity(1281));
        Assertions.assertEquals(1281,pokemonService.getAllPokemon().getCount());
    }

    //holaaaaaaaaaaaaaaaaa

    @Test
    void testHelloRest(){
        Assertions.assertEquals("hello",pokemonService.welcome());
    }
}

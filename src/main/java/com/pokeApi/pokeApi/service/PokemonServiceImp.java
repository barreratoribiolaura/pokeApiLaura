package com.pokeApi.pokeApi.service;

import com.pokeApi.pokeApi.model.PokemonEntity;
import com.pokeApi.pokeApi.model.PokemonResultDetailEntity;
import com.pokeApi.pokeApi.model.PokemonResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonServiceImp implements IPokemonService{
    @Autowired
    public RestTemplate restTemplate;
    static final String URL= "https://pokeapi.co/api/v2";
    public PokemonResultEntity getAllPokemon(){
        String path = URL+"/pokemon";
        PokemonResultEntity pokemons = restTemplate.getForObject(path, PokemonResultEntity.class);
        return pokemons;
    }

    public PokemonResultDetailEntity getPokemon(){
        String path = URL+"/pokemon/{id}";
        PokemonResultDetailEntity pokemon = restTemplate.getForObject(path, PokemonResultDetailEntity.class);
        return pokemon;
    }

    public String welcome(){
        return "hello";
    }
}

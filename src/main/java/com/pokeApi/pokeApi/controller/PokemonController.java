package com.pokeApi.pokeApi.controller;

import com.pokeApi.pokeApi.model.PokemonResultDetailEntity;
import com.pokeApi.pokeApi.model.PokemonResultEntity;
import com.pokeApi.pokeApi.service.PokemonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    @Autowired
    PokemonServiceImp pokemonService;

    @GetMapping("/allPokemon")
    PokemonResultEntity getAllPokemon(){
        return pokemonService.getAllPokemon();
    }

    @RequestMapping(value = "/pokemon/{id}", method = RequestMethod.GET,params = "id")
    PokemonResultDetailEntity getPokemon(){
        return pokemonService.getPokemon();
    }

    @GetMapping("/hello")
    String hello(){
        return pokemonService.welcome();
    }
}

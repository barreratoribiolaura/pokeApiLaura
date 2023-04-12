package com.pokeApi.pokeApi.service;

import com.pokeApi.pokeApi.model.PokemonResultEntity;

public interface IPokemonService{
    public PokemonResultEntity getAllPokemon();
    public String welcome();
}

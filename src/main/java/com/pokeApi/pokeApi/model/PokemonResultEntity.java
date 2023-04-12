package com.pokeApi.pokeApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
public class PokemonResultEntity {
    @JsonProperty("count")
    public int count;
    @JsonProperty("results")
    public List<PokemonResultDetailEntity> pokemonList;

    public PokemonResultEntity() {
    }
    public PokemonResultEntity(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<PokemonResultDetailEntity> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<PokemonResultDetailEntity> pokemonList) {
        this.pokemonList = pokemonList;
    }
}

package com.pokeApi.pokeApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonResultDetailEntity {
    @JsonProperty("name")
    public String name;
    @JsonProperty("url")
    public String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

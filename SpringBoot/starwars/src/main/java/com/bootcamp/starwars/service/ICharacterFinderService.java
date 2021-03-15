package com.bootcamp.starwars.service;

import com.bootcamp.starwars.model.CharacterDTO;

import java.util.List;

public interface ICharacterFinderService {
    List<CharacterDTO> getCharactersByName(String name);
}
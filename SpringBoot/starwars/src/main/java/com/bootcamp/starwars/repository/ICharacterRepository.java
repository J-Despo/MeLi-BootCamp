package com.bootcamp.starwars.repository;


import com.bootcamp.starwars.model.CharacterDTO;

import java.util.List;

public interface ICharacterRepository {
    List<CharacterDTO> findName(String name);
}

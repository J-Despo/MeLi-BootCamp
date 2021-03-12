package com.bootcamp.starwars.service;


import com.bootcamp.starwars.model.CharacterDTO;
import com.bootcamp.starwars.repository.ICharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterFinderService implements ICharacterFinderService{

    @Autowired
    private ICharacterRepository repositoryService;

    @Override
    public List<CharacterDTO> findName(String name) {
        return repositoryService.findName(name);
    }
}
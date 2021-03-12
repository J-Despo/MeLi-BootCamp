package com.bootcamp.starwars.controller;

import com.bootcamp.starwars.model.CharacterDTO;
import com.bootcamp.starwars.service.ICharacterFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
class StarWarsRestController
{

    @Autowired
    private ICharacterFinderService finderService;

    @GetMapping(path = "/{name}")
    public List<CharacterDTO> findCharacter(@PathVariable String name)
    {
        return finderService.findName(name);
    }
}
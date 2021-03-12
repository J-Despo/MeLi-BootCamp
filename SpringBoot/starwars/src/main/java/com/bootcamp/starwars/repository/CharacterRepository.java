package com.bootcamp.starwars.repository;

import com.bootcamp.starwars.model.CharacterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CharacterRepository implements ICharacterRepository{
    @Override
    public List<CharacterDTO> findName(String name) {

        List<CharacterDTO> characters = null;

        characters = loadDatabase();

        List<CharacterDTO> result = null;

        if(characters != null){
            List<CharacterDTO> resultCharacters = characters.stream().filter(i -> i.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
            result = resultCharacters;
        }


        return result;
    }

    private List<CharacterDTO> loadDatabase(){

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CharacterDTO>> typeRef = new TypeReference<>() {};
        List<CharacterDTO> characters = null;

        try {
            characters = objectMapper.readValue(new ClassPathResource("starwars.json").getFile(), typeRef);
        }catch(IOException e){
            e.printStackTrace();
        }
        return characters;
    }
}

package com.bootcamp.starwars.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ResponseDto
{
    List<CharacterDTO> nameList;
}

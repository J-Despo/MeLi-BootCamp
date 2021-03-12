package com.bootcamp.starwars.model;

import java.util.List;

public class ResponseDto
{
    List<CharacterDTO> nameList;

    public List<CharacterDTO> getNameList() {
        return nameList;
    }

    public void setNameList(List<CharacterDTO> nameList) {
        this.nameList = nameList;
    }
}

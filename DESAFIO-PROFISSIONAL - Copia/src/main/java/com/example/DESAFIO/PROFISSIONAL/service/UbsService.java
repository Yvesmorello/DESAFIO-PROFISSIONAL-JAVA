package com.example.DESAFIO.PROFISSIONAL.service;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Ubs;


import java.util.Arrays;
import java.util.List;

public class UbsService {

    public List<Ubs> selectAll(){
        return Arrays.asList(
                new Ubs(),
                new Ubs()
        );
    }
}

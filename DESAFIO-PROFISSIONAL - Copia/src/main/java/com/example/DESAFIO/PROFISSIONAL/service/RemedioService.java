package com.example.DESAFIO.PROFISSIONAL.service;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;

import java.util.Arrays;
import java.util.List;

public class RemedioService {

    public List<Remedio> selectAll(){
        return Arrays.asList(
                new Remedio(),
                new Remedio()
        );
    }
}

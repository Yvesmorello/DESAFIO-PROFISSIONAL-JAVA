package com.example.DESAFIO.PROFISSIONAL.service;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Medico;

import java.util.Arrays;
import java.util.List;

public class MedicoService {

    public List<Medico> selectAll(){
        return Arrays.asList(
                new Medico(),
                new Medico()
        );
    }
}

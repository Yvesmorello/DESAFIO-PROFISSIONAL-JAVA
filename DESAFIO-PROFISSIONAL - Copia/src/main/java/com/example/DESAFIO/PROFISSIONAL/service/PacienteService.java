package com.example.DESAFIO.PROFISSIONAL.service;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Paciente;

import java.util.Arrays;
import java.util.List;

public class PacienteService {

    public List<Paciente> selectAll(){
        return Arrays.asList(
                new Paciente(),
                new Paciente()
        );
    }
}

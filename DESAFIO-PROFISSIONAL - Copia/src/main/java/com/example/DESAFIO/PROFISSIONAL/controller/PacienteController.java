package com.example.DESAFIO.PROFISSIONAL.controller;


//import com.example.DESAFIO.PROFISSIONAL.model.repository.PacienteRepository;
import com.example.DESAFIO.PROFISSIONAL.model.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private PacienteRepository pacienteRepository;

    @GetMapping
    public ModelAndView all(){
        ModelAndView view = new ModelAndView("paciente");
        view.addObject("pacientes", pacienteRepository.findAll());

        return view;
    }

}

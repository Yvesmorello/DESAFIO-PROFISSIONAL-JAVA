package com.example.DESAFIO.PROFISSIONAL.controller;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import com.example.DESAFIO.PROFISSIONAL.model.repository.PacienteRepository;
import com.example.DESAFIO.PROFISSIONAL.model.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/remedio")
public class RemedioController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private RemedioRepository remedioRepository;

    @GetMapping
    public ModelAndView all(){
        ModelAndView view = new ModelAndView("remedio");
        view.addObject("remedios", remedioRepository.findAll());

        return view;
    }

}

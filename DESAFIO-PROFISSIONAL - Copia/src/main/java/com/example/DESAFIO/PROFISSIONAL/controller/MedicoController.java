package com.example.DESAFIO.PROFISSIONAL.controller;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Medico;
import com.example.DESAFIO.PROFISSIONAL.model.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/medico")
public class MedicoController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private MedicoRepository medicoRepository;

    @GetMapping
    public ModelAndView all(){
        ModelAndView view = new ModelAndView("medico");
        view.addObject("medicos", medicoRepository.findAll());

        return view;
    }

}

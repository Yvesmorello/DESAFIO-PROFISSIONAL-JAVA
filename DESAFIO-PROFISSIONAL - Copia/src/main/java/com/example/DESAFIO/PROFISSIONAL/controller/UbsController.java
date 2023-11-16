package com.example.DESAFIO.PROFISSIONAL.controller;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import com.example.DESAFIO.PROFISSIONAL.model.domain.Ubs;
import com.example.DESAFIO.PROFISSIONAL.model.repository.PacienteRepository;
import com.example.DESAFIO.PROFISSIONAL.model.repository.RemedioRepository;
import com.example.DESAFIO.PROFISSIONAL.model.repository.UbsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/ubs")
public class UbsController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private UbsRepository ubsRepository;

    @GetMapping
    public ModelAndView all(){
        ModelAndView view = new ModelAndView("ubs");
        view.addObject("ubs", ubsRepository.findAll());

        return view;
    }

}

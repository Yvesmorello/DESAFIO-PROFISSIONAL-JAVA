package com.example.DESAFIO.PROFISSIONAL.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Entity
@Table(name="remedio")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String dataValidade;

    @NumberFormat
    private int quantidade;

}


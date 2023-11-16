package com.example.DESAFIO.PROFISSIONAL.model.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Entity
@Table(name="paciente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private int idade;

    @Column(name="doc", length = 14)
    private String documento;

    @NonNull
    @NumberFormat
    private String telefone;

    @NonNull
    private String endereco;

    @NonNull
    private String dataNascimento;

}

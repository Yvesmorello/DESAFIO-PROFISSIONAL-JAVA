package com.example.DESAFIO.PROFISSIONAL.model.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="medico")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private Long crm;

    @NonNull
    private String nome;

    @NonNull
    private int idade;

    @NonNull
    private String especialidade;

    @NonNull
    private String ubsAtua;

}

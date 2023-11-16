package com.example.DESAFIO.PROFISSIONAL.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="ubs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ubs {

    @NonNull
    private String local;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String endereco;

    @NonNull
    private String horaFuncionamento;

}

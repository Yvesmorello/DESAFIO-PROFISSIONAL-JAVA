package com.example.DESAFIO.PROFISSIONAL.model.repository;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Long>{}

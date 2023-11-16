package com.example.DESAFIO.PROFISSIONAL.model.repository;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<Remedio,Long>{}

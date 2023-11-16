package com.example.DESAFIO.PROFISSIONAL.model.repository;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import com.example.DESAFIO.PROFISSIONAL.model.domain.Ubs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbsRepository extends JpaRepository<Ubs,Long> {}


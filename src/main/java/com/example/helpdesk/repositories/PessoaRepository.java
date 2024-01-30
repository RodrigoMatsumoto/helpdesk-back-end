package com.example.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    
}

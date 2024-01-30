package com.example.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
    
}

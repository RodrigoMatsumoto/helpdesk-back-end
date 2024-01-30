package com.example.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
    
}

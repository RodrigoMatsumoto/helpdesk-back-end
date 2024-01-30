package com.example.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}

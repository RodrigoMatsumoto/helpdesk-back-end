package com.example.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.helpdesk.domain.Chamado;
import com.example.helpdesk.repositories.ChamadoRepository;
import com.example.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {
    
    @Autowired
    private ChamadoRepository repository;

    public Chamado findById(Integer id) {
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id));
    }

    public List<Chamado> findAll() {
        return repository.findAll();
    }
}

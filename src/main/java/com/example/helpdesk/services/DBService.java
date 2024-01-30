package com.example.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.helpdesk.domain.Chamado;
import com.example.helpdesk.domain.Cliente;
import com.example.helpdesk.domain.Tecnico;
import com.example.helpdesk.domain.enums.Perfil;
import com.example.helpdesk.domain.enums.Prioridade;
import com.example.helpdesk.domain.enums.Status;
import com.example.helpdesk.repositories.ChamadoRepository;
import com.example.helpdesk.repositories.ClienteRepository;
import com.example.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

    @Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
    
    public void instanciaDB() {

        Tecnico tec1 = new Tecnico(null, "Tecnico", "63653230268", "tecnico@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Cliente", "80527954780", "cliente@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
    }
}

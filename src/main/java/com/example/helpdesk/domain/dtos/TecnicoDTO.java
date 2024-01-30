package com.example.helpdesk.domain.dtos;

import java.time.LocalDate;
import java.util.Set;
import com.example.helpdesk.domain.Tecnico;
import com.example.helpdesk.domain.enums.Perfil;
import com.fasterxml.jackson.annotation.JsonFormat;

public record TecnicoDTO(
    Integer id,
    String nome,
    String cpf,
    String email,
    String senha,
    Set<Perfil> perfis,
    @JsonFormat(pattern = "dd/M/yyyy")
    LocalDate dataCriacao) {

        public TecnicoDTO(Tecnico obj) {
            this(obj.getId(), obj.getNome(), obj.getCpf(), obj.getEmail(), obj.getSenha(), obj.getPerfis(), obj.getDataCriacao());
        }
    }
 
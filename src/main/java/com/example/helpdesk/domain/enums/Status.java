package com.example.helpdesk.domain.enums;

public enum Status {
    ABERTO(1, "ABERTO"), ANDAMENTO(2, "ANDAMENTO"), ENCERRADO(3, "ENCERRADO");

    private Integer codigo;
    private String descricao;
    
    private Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    
    public static Status toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (Status x: Status.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Status inválido");
    }
}

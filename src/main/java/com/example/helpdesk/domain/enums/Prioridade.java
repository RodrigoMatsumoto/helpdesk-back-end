package com.example.helpdesk.domain.enums;

public enum Prioridade {
    BAIXA(1, "BAIXA"), MEDIA(2, "MEDIA"), ALTA(3, "ALTA");

    private Integer codigo;
    private String descricao;
    
    private Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    
    public static Prioridade toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (Prioridade x: Prioridade.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Prioridade inválida");
    }
}

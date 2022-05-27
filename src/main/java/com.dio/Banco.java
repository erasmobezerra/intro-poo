package com.dio;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class Banco {

    @Getter @Setter
    private String nome;

    @Getter
    private List<Conta> conta;


    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", conta=" + conta +
                '}';
    }
}

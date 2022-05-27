package com.dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public String imprimirExtrato() {
        return "Extrato da Conta Corrente: " + super.imprimirExtrato();
    }
}

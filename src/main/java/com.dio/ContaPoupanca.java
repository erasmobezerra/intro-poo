package com.dio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }


    @Override
    public String imprimirExtrato() {
        return "Extrato da Conta Poupança: " + super.imprimirExtrato();

    }
}

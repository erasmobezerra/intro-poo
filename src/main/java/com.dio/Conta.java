package com.dio;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String imprimirExtrato() {
        return  "agencia=" + this.agencia +
                ", numero=" + this.numero +
                ", saldo=" + this.saldo +
                ", cliente=" + this.cliente.getNome() +
                ", banco=" + this.banco.getNome() +
                '}';
    }
}
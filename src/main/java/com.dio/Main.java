package com.dio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Erasmo");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Rafael");

        Banco banco = new Banco();
        banco.setNome("Inter");
        Banco banco2 = new Banco();
        banco2.setNome("Bradesco");

        Conta contaCorrente = new ContaCorrente(cliente, banco);
        Conta contaPoupanca = new ContaPoupanca(cliente2, banco2);

        contaCorrente.depositar(100);
        contaPoupanca.transferir(100, contaPoupanca);

        System.out.println(contaCorrente.imprimirExtrato());
        System.out.println(contaPoupanca.imprimirExtrato());

    }
}

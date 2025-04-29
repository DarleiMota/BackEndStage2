package Pratica3_3.tipoConta;

import Pratica3_3.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(String titular, double tarifaMensal) {
        super(titular);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        double saldoAtual = getSaldo();
        if (saldoAtual >= tarifaMensal) {
            setSaldo(saldoAtual - tarifaMensal);
            System.out.printf("Tarifa mensal de R$%.2f cobrada com sucesso.%n", tarifaMensal);
        } else {
            System.out.println("Saldo insuficiente para cobrança da tarifa mensal.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("======= Conta Corrente =======");
        System.out.printf("Titular: %s%n", getTitular());
        consultarSaldo();
    }
}
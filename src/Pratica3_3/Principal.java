/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(),
sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe
ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(),
que desconta uma tarifa mensal da conta corrente.
*/



package Pratica3_3;

import Pratica3_3.tipoConta.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Darlei Mota", 15.00);

        conta.depositar(200);
        conta.sacar(50);
        conta.cobrarTarifaMensal();
        conta.mostrarInformacoes();
    }
}
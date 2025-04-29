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
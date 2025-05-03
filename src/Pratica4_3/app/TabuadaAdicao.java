package Pratica4_3.app;

import Pratica4_3.interfaces.Tabuada;

public class TabuadaAdicao implements Tabuada {

    private int numero;

    public TabuadaAdicao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d + %d = %d\n", numero, i, numero + i);
        }
    }
}
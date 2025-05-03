package Pratica4_3.app;

import Pratica4_3.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10 ; i++) {
            int resultado = i * numero;
            System.out.printf("%d X %d = %d%n", numero, i, resultado);
        }
    }
}

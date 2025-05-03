package Pratica4_3.app;

import Pratica4_3.interfaces.Tabuada;

public class TabuadaDivisao implements Tabuada {

    private int numero;

    public TabuadaDivisao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            double resultado = (double) numero / i;
            System.out.printf("%d ÷ %d = %.2f\n", numero, i, resultado);
        }
    }
}
package Pratica3_4.verificar;

import Pratica3_4.NumerosPrimos;

public class VerificadorPrimo extends NumerosPrimos {

    public void verficarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo. ");
        } else {
            System.out.println(numero + " não é primo");
        }
    }

    public void listarPrimos(int limite){
        System.out.println("VerificarPrimo diz: ");
        super.listarPrimos(limite);
    }
}

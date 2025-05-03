package Pratica3_4.verificar;

import Pratica3_4.NumerosPrimos;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int numeroConhecido){
        int proximoNumero = numeroConhecido + 1;

        while (true){
            if (verificarPrimalidade(proximoNumero)){
                return proximoNumero;
            }
            proximoNumero++;
        }
    }
}

package Pratica3_2;

import Pratica3_2.animais.Cachorro;
import Pratica3_2.animais.Gato;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Simba","Salsicha");
        Gato gato = new Gato("Lord","Sianes");

        cachorro.mostrarInformacao();
        gato.mostrarInformacao();


    }
}

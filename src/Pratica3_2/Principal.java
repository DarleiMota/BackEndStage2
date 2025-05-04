/*
Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses:
Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses,
utilizando a anotação @Override para indicar que estão sobrescrevendo o método.
Além disso, adicione métodos específicos para cada subclasse, como abanarRabo()
para o Cachorro e arranharMoveis() para o Gato.
 */

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

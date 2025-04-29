//Crie uma classe Calculadora com um método que recebe um número como
//parâmetro e retorna o dobro desse número.

package Pratica1_2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber o seu dobro: ");
        int numero = scanner.nextInt();
        int dobro = calculadora.dobrarValor(numero);

        System.out.printf("O dobro do numero %d e igual a %d", numero,dobro);
    }
}

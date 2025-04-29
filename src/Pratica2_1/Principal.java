//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo
// (privado) e titular (publico). Implemente métodos getters e setters para os
// atributos privados.

package Pratica2_1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui o dados para registro da conta ");
        System.out.print("Qual é o nome do titular da conta: ");
        conta.titular = scanner.nextLine();
        System.out.print("O numero da conta: ");
        conta.setNumeroConta(scanner.nextDouble());
        System.out.print("Qual é o saldo atual: ");
        conta.setSaldo(scanner.nextDouble());

        conta.mostrarFicha();

        scanner.close();
    }
}

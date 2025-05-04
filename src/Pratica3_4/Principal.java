/*
rie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe
NumerosPrimos. Adicione um método específico para cada uma das subclasses, como
verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
 */
package Pratica3_4;

import Pratica3_4.verificar.GeradorPrimo;
import Pratica3_4.verificar.VerificadorPrimo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumerosPrimos primos = new NumerosPrimos();
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        int opcao;

        do {
            System.out.println("\n--- MENU NÚMEROS PRIMOS ---");
            System.out.println("1 - Verificar se um número é primo");
            System.out.println("2 - Listar primos até um número");
            System.out.println("3 - Listar primos menores que um número");
            System.out.println("4 - Gerar próximo primo a partir de um número");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int num1 = scanner.nextInt();
                    verificador.verficarSeEhPrimo(num1);
                    break;

                case 2:
                    System.out.print("Digite o limite: ");
                    int limite = scanner.nextInt();
                    primos.listarPrimos(limite);
                    break;

                case 3:
                    System.out.print("Digite o número: ");
                    int num3 = scanner.nextInt();
                    primos.listarPrimosMenoresQue(num3);
                    break;

                case 4:
                    System.out.print("Digite um número: ");
                    int num4 = scanner.nextInt();
                    int proximo = gerador.gerarProximoPrimo(num4);
                    System.out.println("Próximo primo após " + num4 + ": " + proximo);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número do menu de opções");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
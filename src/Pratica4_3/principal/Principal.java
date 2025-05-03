package Pratica4_3.principal;

import Pratica4_3.app.TabuadaAdicao;
import Pratica4_3.app.TabuadaDivisao;
import Pratica4_3.app.TabuadaMultiplicacao;
import Pratica4_3.app.TabuadaSubtracao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu da Tabuada =====");
            System.out.println("1 - Tabuada de Multiplicação");
            System.out.println("2 - Tabuada de Adição");
            System.out.println("3 - Tabuada de Subtração");
            System.out.println("4 - Tabuada de Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Informe o número para a tabuada: ");
                int numero = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        TabuadaMultiplicacao mult = new TabuadaMultiplicacao(numero);
                        mult.mostrarTabuada();
                        break;
                    case 2:
                        TabuadaAdicao adicao = new TabuadaAdicao(numero);
                        adicao.mostrarTabuada();
                        break;
                    case 3:
                        TabuadaSubtracao subtracao = new TabuadaSubtracao(numero);
                        subtracao.mostrarTabuada();
                        break;
                    case 4:
                        TabuadaDivisao divisao = new TabuadaDivisao(numero);
                        divisao.mostrarTabuada();
                        break;
                }
            } else if (opcao != 5) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Programa finalizado!");
    }
}
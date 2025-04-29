package Pratica1_4;

import java.time.LocalDate;
import java.util.Scanner;

public class Carro {

    String modelo;
    int anoCarro;
    String corCarro;
    int idadeCarro;

    Scanner scanner = new Scanner(System.in);

    void exibirFichaTecnica(){
        System.out.println("\n==== Ficha Técnica do Carro ====\n");

        System.out.printf("Modelo do Carro: %s\n", modelo);
        System.out.printf("Ano de Fabricação: %d\n", anoCarro);
        System.out.printf("Cor do Carro: %s\n", corCarro);
    }

    void calcularIdadeCarro(){
        int anoAtual = LocalDate.now().getYear(); // a forma de pegar o Ano atual
        idadeCarro = anoAtual - anoCarro;
        System.out.printf("\nA idade do carro é: %d anos.\n", idadeCarro);
    }

    void coletarDadosCarro(){
        System.out.print("Digite o nome do carro: ");
        modelo = scanner.nextLine();

        System.out.print("Digite o Ano do carro: ");
        anoCarro = scanner.nextInt();


        scanner.nextLine(); // pra não bugar pegando a cor do carro.

        System.out.print("Qual é a cor do carro: ");
        corCarro = scanner.nextLine();
    }
}

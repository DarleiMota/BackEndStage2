package Pratica1_5;

import java.util.Scanner;

public class Aluno {

    String nomeAluno;
    int idadeAluno;

    Scanner scanner = new Scanner(System.in);

    void exibirInformacoes() {

        System.out.println("==== Ficha do Aluno ====");
        System.out.println("1 - Nome: " + nomeAluno);
        System.out.println("2 - Idade: " + idadeAluno);

    }

    void coletarDados() {

        String mensagem = """
                Olá, prencha os dados para cadastrar a ficha do Aluno""";
        System.out.println(mensagem);

        System.out.printf("Qual é o nome do Aluno: ");
        nomeAluno = scanner.nextLine();
        System.out.printf("Qual é a idade do Aluno: ");
        idadeAluno = scanner.nextInt();
    }
}

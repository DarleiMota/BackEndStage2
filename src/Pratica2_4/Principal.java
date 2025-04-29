package Pratica2_4;
//Desenvolva uma classe Aluno com os atributos privados nome e notas.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método calcularMedia que retorna a média das notas do aluno.

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aluno 1
        System.out.print("Digite o nome do aluno 1: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a nota 1 do aluno 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2 do aluno 1: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3 do aluno 1: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno1 = new Aluno(nome1, nota1, nota2, nota3);

        scanner.nextLine(); // resetando o scanner

        //Aluno 2
        System.out.print("\nDigite o nome do aluno 2: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a nota 1 do aluno 2: ");
        double nota1_2 = scanner.nextDouble();
        System.out.print("Digite a nota 2 do aluno 2: ");
        double nota2_2 = scanner.nextDouble();
        System.out.print("Digite a nota 3 do aluno 2: ");
        double nota3_2 = scanner.nextDouble();

        Aluno aluno2 = new Aluno(nome2, nota1_2, nota2_2, nota3_2);

        scanner.nextLine();// resetando o scanner

        // Imprimir aluno 1
        System.out.println("\nAluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());

        // Imprimir aluno 2
        System.out.println("\nAluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());

        scanner.close();
    }
}

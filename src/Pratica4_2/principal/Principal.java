/*
Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico
com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de
uma sala retangular. A classe deve receber altura e largura como parâmetros.
Obs.: Apesar do exercício pedir uma coisa eu fui mais além com outras formas.
 */
package Pratica4_2.principal;
import Pratica4_2.app.CalcularCirculo;
import Pratica4_2.app.CalcularQuadrado;
import Pratica4_2.app.CalcularRetangulo;
import Pratica4_2.app.CalcularTriangulo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cálculo do Círculo");
            System.out.println("2 - Cálculo do Quadrado");
            System.out.println("3 - Cálculo do Retângulo");
            System.out.println("4 - Cálculo do Triângulo");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //Círculo
                    System.out.print("Informe o raio do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    CalcularCirculo circulo = new CalcularCirculo(raioCirculo);
                    System.out.println("Área do Círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
                    break;

                case 2: //Quadrado
                    System.out.print("Informe o lado do quadrado: ");
                    double ladoQuadrado = scanner.nextDouble();
                    CalcularQuadrado quadrado = new CalcularQuadrado(ladoQuadrado);
                    System.out.println("Área do Quadrado: " + quadrado.calcularArea());
                    System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
                    break;

                case 3: //Retângulo
                    System.out.print("Informe a altura do retângulo: ");
                    double alturaRetangulo = scanner.nextDouble();
                    System.out.print("Informe a largura do retângulo: ");
                    double larguraRetangulo = scanner.nextDouble();
                    CalcularRetangulo retangulo = new CalcularRetangulo(alturaRetangulo, larguraRetangulo);
                    System.out.println("Área do Retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
                    break;

                case 4: //Triângulo
                    System.out.print("Informe a base do triângulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Informe a altura do triângulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    CalcularTriangulo triangulo = new CalcularTriangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("Área do Triângulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());
                    break;

                case 5: // Sair
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);
    }
}


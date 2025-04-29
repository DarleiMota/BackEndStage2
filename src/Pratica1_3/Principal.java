//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao
// e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e
// calcular a média de avaliações.

package Pratica1_3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Scanner scanner = new Scanner(System.in);
        String sair;

        do {
            musica.fichaTecnica();
            musica.avaliarMusica();
            musica.imprimirFicha();
            musica.calcularMediaAvaliacoes();

            System.out.println("Digite 's' para sair ou qualquer outra tecla para continuar:");
            sair = scanner.nextLine();
        } while (!sair.equalsIgnoreCase("s"));

        System.out.println("Fim do programa.");
    }
}

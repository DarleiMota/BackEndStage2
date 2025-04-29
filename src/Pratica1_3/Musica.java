package Pratica1_3;

import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao; // última avaliação
    int numAvaliacao = 0;
    int somaAvaliacao = 0;

    Scanner scanner = new Scanner(System.in);

    void fichaTecnica() {
        String mensagem = """
                ===== Ficha da música ====
                1 - Titulo:
                2 - Artista:
                3 - Ano de Lançamento:
                4 - Avaliação: 1 a 5
                    1 - Muito Ruim
                    2 - Ruim
                    3 - Médio
                    4 - Bom
                    5 - Muito Bom
                """;
        System.out.println(mensagem);

        System.out.println("Digite o Título: ");
        titulo = scanner.nextLine();

        System.out.println("Digite o Artista: ");
        artista = scanner.nextLine();

        System.out.println("Digite o ano de Lançamento: ");
        anoLancamento = scanner.nextInt();
        scanner.nextLine(); // Usado aqui para que ele não pule na proxima
    }

    void imprimirFicha() {
        String fichaMensagem =
                "==== Ficha da Música ====\n" +
                        "Título: " + titulo + "\n" +
                        "Artista: " + artista + "\n" +
                        "Ano de Lançamento: " + anoLancamento + "\n" +
                        "Última Avaliação: " + avaliacao + "\n" +
                        "Número de Avaliações: " + numAvaliacao;

        System.out.println(fichaMensagem);
    }

    void avaliarMusica() {
        int avaliacaoInicial;
        do {
            System.out.println("Dê uma avaliação para a música (1 a 5): ");
            avaliacaoInicial = scanner.nextInt();
        } while (avaliacaoInicial < 1 || avaliacaoInicial > 5);

        avaliacao = avaliacaoInicial; // atualizar a última avaliação
        somaAvaliacao += avaliacaoInicial;
        numAvaliacao++;
        scanner.nextLine(); // usado aqui para que ele registre as avaliação corretas
    }

    void calcularMediaAvaliacoes() {
        if (numAvaliacao > 0) {
            double media = (double) somaAvaliacao / numAvaliacao;
            System.out.println("A média das avaliações é: " + media);
        } else {
            System.out.println("Nenhuma avaliação foi registrada ainda");
        }
    }
}
//Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método exibirDetalhes que imprime o título e o autor do livro.

package Pratica2_5;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;

    Scanner scanner = new Scanner(System.in);


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exbirDetalhes() {
        System.out.println("\n===== LIVRO ======");
        System.out.printf("1 - Titulo: %s%n", getTitulo());
        System.out.printf("2 - Autor: %s", getAutor());
    }

    public void coletarDetalhes() {
        System.out.println("Preencha a Ficha para cadastra o livro");

        System.out.print("1 - Titulo : ");
        setTitulo(scanner.nextLine());

        System.out.print("2 - Autor : ");
        setAutor(scanner.nextLine());
    }
}

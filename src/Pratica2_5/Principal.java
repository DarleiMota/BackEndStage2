//Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método exibirDetalhes que imprime o título e o autor do livro.

package Pratica2_5;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.coletarDetalhes(); // coleta os detalhes do livro
        livro.exbirDetalhes(); // exibi os detalhes do livro
    }
}

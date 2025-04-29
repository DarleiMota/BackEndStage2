//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método aplicarDesconto que recebe um valor percentual e
//  reduz o preço do produto.

package Pratica2_3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Digite o preço do produto: ");
        produto.setPreco(scanner.nextDouble());

        System.out.print("Digite o percentual de desconto % : ");
        produto.setPercentual(scanner.nextDouble());

        System.out.println("\nAntes do desconto:");

        produto.exibirFichaDesconto(); // Antes do desconto, pega a variavel antes da mudança
        produto.aplicarDesconto();

        System.out.println("\nApós o desconto:");
        produto.exibirFichaDesconto(); // Depois da mundança

        scanner.close();
    }
}
package Pratica4_4.principal;

import Pratica4_4.modelos.Livro;
import Pratica4_4.modelos.ProdutoFisico;

public class Principal {
        public static void main(String[] args) {
            Livro livro = new Livro("O Senhor dos Anéis", 100.0, "L001", "J.R.R. Tolkien");
            ProdutoFisico caneta = new ProdutoFisico("Caneta Esferográfica", 5.0, "P001");

            System.out.println("Livro: " + livro.getNome());
            System.out.printf("Preço final: R$ %.2f%n", livro.calcularPrecoFinal());

            System.out.println("\nProduto Físico: " + caneta.getNome());
            System.out.printf("Preço final: R$ %.2f%n", caneta.calcularPrecoFinal());
        }
    }


package Pratica4_4.modelos;

import Pratica4_4.interfaces.Calculavel;

public class Livro extends Produto implements Calculavel {

    private String autor;
    private double desconto = 0.1; // 10% de desconto padrão para livros

    public Livro(String nome, double precoBase, String codigo, String autor) {
        super(nome, precoBase, codigo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * (1 - desconto);
    }
}
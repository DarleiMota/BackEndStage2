package Pratica4_4.modelos;

import Pratica4_4.interfaces.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel {

    private double taxaEnvio = 12.5;

    public ProdutoFisico(String nome, double precoBase, String codigo) {
        super(nome, precoBase, codigo);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + taxaEnvio;
    }
}
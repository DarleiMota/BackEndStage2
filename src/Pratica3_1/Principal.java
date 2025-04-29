package Pratica3_1;

import Pratica3_1.ModeloCarro.ModeloCarro;

public class Principal {
    public static void main(String[] args) {

        ModeloCarro meuCarro = new ModeloCarro("Gol");

        meuCarro.adicionarPreco(2022,43000);
        meuCarro.adicionarPreco(2021,50000);
        meuCarro.adicionarPreco(2019,38000);

        meuCarro.mostrarInformacoes();

    }
}

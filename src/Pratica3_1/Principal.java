/*
 Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
 Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular
  e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias
  específicas, utilizando-a na classe principal para definir preços e mostrar informações.
*/
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

package Pratica3_1.ModeloCarro;

import Pratica3_1.Carro;

public class ModeloCarro extends Carro {


    public ModeloCarro(String modelo){
        setModelo(modelo);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("=== Informações do Modelo Específico ===");
        super.mostrarInformacoes();
        System.out.println("Este e um modelo muito procurado");

    }
}

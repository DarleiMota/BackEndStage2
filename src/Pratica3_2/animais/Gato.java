package Pratica3_2.animais;

import Pratica3_2.Animal;

public class Gato extends Animal {

    private String nomeAnimal;
    private String raca;

    public Gato(String nomeAnimal, String raca) {
        super("Gato");
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miauu Miauuu !!!");
    }

    public void arranhaMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("\n========== INFORMAÇÕES DO GATO ==============");
        super.mostrarInformacao();
        if (getTipoAnimal().equals("Gato")) {
            System.out.printf("Os %s são cheios de personalidade!\n", getTipoAnimal());
            arranhaMoveis();
        }
        System.out.printf(" Nome: %s%n", getNomeAnimal());
        System.out.printf(" Raça: %s%n", getRaca());
        System.out.println("==============================================");
    }
}
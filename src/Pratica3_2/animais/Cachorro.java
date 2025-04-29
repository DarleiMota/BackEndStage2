package Pratica3_2.animais;

import Pratica3_2.Animal;

public class Cachorro extends Animal {

    private String nomeAnimal;
    private String raca;

    public Cachorro(String nomeAnimal, String raca) {
        super("Cachorro");
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
        System.out.println("O cachorro faz: Au Au Au!!!!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo");
    }
    @Override
    public void mostrarInformacao() {
        System.out.println("\n========== INFORMAÇÕES DO CACHORRO ==========");
        super.mostrarInformacao();
        if (getTipoAnimal().equals("Cachorro")) {
            System.out.printf(" Os %s são a alegria da casa!\n", getTipoAnimal());
            abanarRabo();
        }
        System.out.printf(" Nome: %s%n", getNomeAnimal());
        System.out.printf(" Raça: %s%n", getRaca());
        System.out.println("==============================================");
    }
}
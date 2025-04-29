package Pratica3_2;

public class Animal {
    private String tipoAnimal;

    public Animal( String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void emitirSom(){
        System.out.println("Som do animal");
    }

    public void mostrarInformacao() {
        System.out.println("Informações gerais sobre o animal:");
        System.out.println("- Estão sempre à nossa volta.");
        emitirSom();
    }
}

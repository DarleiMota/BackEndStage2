//Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.


package Pratica2_2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void mostrarFicha() {
        System.out.println("\n====== Ficha Pessoal =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }


    public void verificarMaiorIdade() {
        if (getIdade() < 18) {
            System.out.printf("O %s é menor de idade com %d anos %n", getNome(), getIdade());
        } else {
            System.out.printf("O %s é maior de idade com %d anos ", getNome(), getIdade());
        }
        System.out.println("Fim do programa!!!!");
    }
}

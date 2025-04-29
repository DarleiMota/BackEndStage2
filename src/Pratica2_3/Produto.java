//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método aplicarDesconto que recebe um valor percentual e
//  reduz o preço do produto.

package Pratica2_3;

public class Produto {
    private String nome;
    private double preco;
    private double percentual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public void aplicarDesconto() {
        setPreco(getPreco() * (1 - getPercentual() / 100)); // foi usado 1- para sobrar a parte do desconto
    }

    public void exibirFichaDesconto() {
        System.out.println("Produto: " + getNome());
        System.out.printf("Preço com desconto: %.2f%n", getPreco());
    }
}

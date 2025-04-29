package Pratica3_1;

public class Carro {

    private String modelo;
    private int[] anos = new int[3];
    private double[] precos = new double[3];

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public int[] getAnos() {

        return anos;
    }

    public double[] getPrecos() {

        return precos;
    }

    public void adicionarPreco(int ano, double preco) {
        for (int i = 0; i < anos.length; i++) {
            if (anos[i] == 0) {
                anos[i] = ano;
                precos[i] = preco;
                return;
            }
        }
        System.out.println("Todos os anos já foram preenchidos.");
    }

    public double menorPreco() {
        double menor = precos[0];
        for (double preco : precos) {
            if (preco < menor) {
                menor = preco;
            }
        }
        return menor;
    }

    public double maiorPreco() {
        double maior = precos[0];
        for (double preco : precos) {
            if (preco > maior) {
                maior = preco;
            }
        }
        return maior;
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo);
        for (int i = 0; i < anos.length; i++) {
            System.out.println("Ano: " + anos[i] + " - Preço: R$ " + precos[i]);
        }
        System.out.println("Menor preço: R$ " + menorPreco());
        System.out.println("Maior preço: R$ " + maiorPreco());
    }
}
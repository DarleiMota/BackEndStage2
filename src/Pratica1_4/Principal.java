//Crie uma classe Carro com atributos modelo,
// ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

package Pratica1_4;

public class Principal {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.coletarDadosCarro();
        carro.exibirFichaTecnica();
        carro.calcularIdadeCarro();
    }
}
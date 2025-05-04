/*
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com
o método converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.
 */
package Pratica4_1.principal;

import Pratica4_1.app.ConversorMoeda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ConversorMoeda conversor = new ConversorMoeda();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digete o valor para conversão: ");
        double valorEmDolar = scanner.nextDouble();
        double valorConvertido = conversor.converterDolarParaReal(valorEmDolar);

        System.out.printf("US$ %.2f convertido para reais = R$ %.2f\n",
                valorEmDolar, valorConvertido);
    }
}

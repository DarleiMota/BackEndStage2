package Pratica4_1.app;

import Pratica4_1.financeiro.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    private double taxaCambio = 5.0;

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converterDolarParaReal(double valorDolar){
        return valorDolar * taxaCambio;
    }
}

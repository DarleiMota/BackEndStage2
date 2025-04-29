

package Pratica2_1;

public class ContaBancaria {

    public String titular;
    private double  numeroConta;
    private double saldo;

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarFicha(){
        System.out.println("\n====== Ficha Bancaria =====");
        System.out.println("Titular: "+titular);
        System.out.println("Conta nº: "+getNumeroConta());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Fim do programa!!!");
    }

}

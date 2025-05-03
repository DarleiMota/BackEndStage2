package Pratica3_4;

public class NumerosPrimos {
    private int ultimoNumeroVerificado;

    public int getUltimoNumeroVerificado() {
        return ultimoNumeroVerificado;
    }

    public void setUltimoNumeroVerificado(int numero) {
        this.ultimoNumeroVerificado = numero;
    }

    public boolean verificarPrimalidade(int numero) {
        setUltimoNumeroVerificado(numero);

        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }

    public void listarPrimos(int limite) {
        System.out.println("Listando primos até " + limite + ":");

        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public void listarPrimosMenoresQue(int numero) {
        System.out.println("Números primos menores que " + numero + ":");

        for (int i = 2; i < numero; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
//Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

package Pratica2_2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        IdadePessoa pessoa = new IdadePessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificando maior idade, preencha a ficha:");
        System.out.print("1 - Nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("2 - Idade: ");
        pessoa.setIdade(scanner.nextInt());

        pessoa.mostrarFicha();
        pessoa.verificarMaiorIdade();

        scanner.close();
    }
}

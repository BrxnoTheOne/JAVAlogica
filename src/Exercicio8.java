import java.util.Scanner;

public class Exercicio8 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreve 2 valores: ");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        while (valor2 <= 0){
            System.out.println("Escreva um valor positivo!");
            valor2 = scanner.nextInt();
        }

        int divisao = valor1 / valor2;
        System.out.println("\nValores lidos com sucesso!");
        System.out.println("O resultado da divisão é: " + divisao);

        scanner.close();
    }
}

//8 - Enquanto isso
//Faça um programa para ler 2 valores informados pelo usuário.
// e se o segundo valor informado for neutro, deve ser lido
//um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o
//resultado da divisão do primeiro valor lido pelo segundo valor lido.
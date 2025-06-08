import  java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 valores: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num3 > num2) {

            int soma = num1 + num3;
            System.out.println("A soma é: " + soma);
        } else if (num2 > num1 && num3 > num1) {

            int soma = num2 + num3;
            System.out.println("A soma é: " + soma);
        } else if (num1 > num3 && num2 > num3) {
            int soma = num1 + num2;
            System.out.println("A soma é: " + soma);
        }
    }
}

//7 - Qual o quê?
//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
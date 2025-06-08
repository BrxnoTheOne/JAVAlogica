package Exercicio4;

import java.util.Scanner;

class CalculaParalelogramo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cálculo da Área do Paralelogramo ---");


        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();


        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();


        double area = base * altura;


        System.out.println("A área do paralelogramo é: " + area);

        scanner.close();
    }
}
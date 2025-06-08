package Exercicio4;

import java.util.Scanner;

class CalculaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cálculo da Área do Trapézio ---");

        System.out.print("Digite a base maior: ");
        double baseMaior = scanner.nextDouble();


        System.out.print("Digite a base menor: ");
        double baseMenor = scanner.nextDouble();


        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();


        double area = ((baseMaior + baseMenor) * altura) / 2;


        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }
}
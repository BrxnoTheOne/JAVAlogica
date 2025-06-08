package Exercicio4;

import java.util.Scanner;

class CalculaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cálculo da Área do Losango ---");


        System.out.print("Digite a diagonal maior: ");
        double diagonalMaior = scanner.nextDouble();


        System.out.print("Digite a diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();


        double area = (diagonalMaior * diagonalMenor) / 2;


        System.out.println("A área do losango é: " + area);

        scanner.close();
    }
}
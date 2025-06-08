package Exercicio4;

import java.util.Scanner;

public class CalculoRetangulo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Calculando a Área do Retângulo ---");

            System.out.print("Digite a base: ");
            double base = scanner.nextDouble();

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            double area = base * altura;

            System.out.println("A área do retângulo é: " + area);

            scanner.close();
        }
    }



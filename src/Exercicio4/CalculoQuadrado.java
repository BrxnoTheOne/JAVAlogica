package Exercicio4;
import java.util.Scanner;

class CalculaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculando a Área do Quadrado ---");

        System.out.print("Digite o lado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}
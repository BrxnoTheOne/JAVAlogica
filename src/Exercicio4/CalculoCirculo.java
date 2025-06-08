package Exercicio4;
import java.util.Scanner;


class CalculaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cálculo da Área do Círculo ---");
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        // Math.PI contém o valor de π
        double area = Math.PI * (raio * raio);
        System.out.println("A área do círculo é: " + area);
        scanner.close();
    }
}
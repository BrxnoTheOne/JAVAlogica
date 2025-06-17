import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Exercicio9 {

    public static void main (String[] args){


            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva 10 valores: ");

        final int TAMANHO_DO_ARRAY = 10;
        double[] numeros = new double[TAMANHO_DO_ARRAY];
        double soma = 0.0;

        for (int i = 0; i < TAMANHO_DO_ARRAY; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");


            numeros[i] = scanner.nextDouble();

            soma += numeros[i];
        }

        double media = soma / TAMANHO_DO_ARRAY;

        System.out.println("Números digitados: " + Arrays.toString(numeros));
        System.out.printf("A média desses números é: "+ media);

        scanner.close();
    }
}
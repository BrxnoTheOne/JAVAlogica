import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Exercicio10 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Diga suas notas: \n");
        final int TAMANHO_DO_ARRAY = 4;
        double[] numeros = new double[TAMANHO_DO_ARRAY];
        double soma = 0.0;

        for (int i = 0; i < TAMANHO_DO_ARRAY; i++) {
            System.out.print("Digite a " + (i + 1) + "º nota: ");

            numeros[i] = scanner.nextDouble();

            soma += numeros[i];
        }

        double media = soma / TAMANHO_DO_ARRAY;

        if (media < 6){


            System.out.println("Sua nota é: "+media+ "\n qual não é suficiente. Portanto esta de recuperação !");
        } else {

            System.out.println("Sua nota é: "+media+ "\nVoce esta aprovado!");
        }
    }
}

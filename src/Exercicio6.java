import java.util.Scanner;

public class Exercicio6 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 4 números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println("O número "+ num1 + " é o maior");
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("O número "+ num2 + " é o maior");
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("O número "+ num3 + " é o maior");
        } else if (num4 > num1 && num4 > num3 && num4 > num2) {
            System.out.println("O número "+ num4     + " é o maior");
        }
    }
}

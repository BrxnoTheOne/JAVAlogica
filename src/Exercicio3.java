import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("give your name, press enter and give your age: ");

        String userName = myObj.nextLine();  // Read user input
        int age = myObj.nextInt();

        System.out.println("Username is " + userName + " and age is "+ age);  // Output user input

    }
}
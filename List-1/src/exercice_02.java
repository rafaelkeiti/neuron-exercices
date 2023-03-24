import java.util.Scanner;

public class exercice_02 {
    public static void main(String[] args) {
        double number = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        number = input.nextDouble();
        System.out.println("Você digitou o número: " + number);
    }
}
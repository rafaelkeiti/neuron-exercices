import java.util.Scanner;

public class exercice_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double typedNumber = input.nextDouble();

        System.out.println("Você digitou o número: " + typedNumber);
    }
}
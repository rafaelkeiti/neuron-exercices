import java.util.Scanner;

public class exercice_02 {
    public static void main(String[] args) {
        double typedNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        typedNumber = input.nextDouble();
        System.out.println("Você digitou o número: " + typedNumber);
    }
}
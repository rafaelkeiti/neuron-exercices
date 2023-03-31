import java.util.Scanner;

public class exercice_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber;

        System.out.println("Digite um número para saber se ele é inteiro ou decimal:");
        firstNumber = input.nextDouble();

        if (firstNumber == Math.floor(firstNumber)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
    }
}

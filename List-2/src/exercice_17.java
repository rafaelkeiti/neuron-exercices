import java.util.Scanner;

public class exercice_17 {

    private static final int TWO = 2;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int year = input.nextInt();

        int leapYear = year % TWO;

        if (leapYear == ZERO) {
            System.out.println(year + " é um year bissexto.");
        } else {
            System.out.println(year + " não é bissexto.");
        }
    }
}

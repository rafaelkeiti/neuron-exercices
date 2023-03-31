import java.util.Scanner;

public class exercice_17 {

    public static final int TWO = 2;
    public static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        int leapYear;

        System.out.println("Digite um número:");
        year = input.nextInt();

        leapYear = year % TWO;

        if (leapYear == ZERO) {
            System.out.println(year + " é um year bissexto.");
        } else {
            System.out.println(year + " não é bissexto.");
        }
    }
}

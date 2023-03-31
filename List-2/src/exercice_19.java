import java.util.Scanner;

public class exercice_19 {

    public static final int MAXIMUM_NUMBER = 1000;
    public static final int ONE_HUNDRED = 100;
    public static final int TEN = 10;
    public static final int ZERO = 0;
    public static final int ONE = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int hundreds = 0;
        int dozens = 0;
        int units = 0;

        System.out.println("Digite um número menor que 1000:");
        number = input.nextInt();

        if (number < MAXIMUM_NUMBER) {
            hundreds = number / ONE_HUNDRED;
            dozens = (number % ONE_HUNDRED) / TEN;
            units = ((number % ONE_HUNDRED) % TEN);
        }

        if (hundreds > ZERO) {
            System.out.print(hundreds);
            if (hundreds == ONE) {
                System.out.print(" centena.");
            } else {
                System.out.print(" centenas.");
            }

            if (dozens == ZERO && units == ZERO) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }

        if (dozens > ZERO) {
            System.out.print(dozens);
            if (dozens == ONE) {
                System.out.print(" dezena.");
            } else {
                System.out.print(" dezenas.");
            }

            if (units == ZERO) {
                System.out.println(".");
            } else {
                System.out.print(" e ");
            }
        }

        if (units > ZERO) {
            System.out.print(units);
            if (units == ONE) {
                System.out.print(" unidade.");
            } else {
                System.out.print(" unidades.");
            }
        }
    }
}

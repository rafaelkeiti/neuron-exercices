import java.util.Scanner;

public class exercice_21 {

    private static final int MINIMUM_WITHDRAWAL = 10;
    private static final int MAXIMUM_WITHDRAWAL = 600;
    private static final int NOTES_OF_ONE_HUNDREDS = 100;
    private static final int FIFTY_NOTES = 50;
    private static final int TEN_NOTES = 10;
    private static final int FIVE_NOTES = 5;
    private static final int ONE_REAL = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite quanto deseja sacar:");
        int valueWithdraw = input.nextInt();

        if (valueWithdraw < MINIMUM_WITHDRAWAL || valueWithdraw > MAXIMUM_WITHDRAWAL) {
            System.out.println("Digite valores de 10 até 600.");
        } else {
            int notesOfOneHundreds = valueWithdraw / NOTES_OF_ONE_HUNDREDS;
            valueWithdraw %= NOTES_OF_ONE_HUNDREDS;

            int fiftyNotes = valueWithdraw / FIFTY_NOTES;
            valueWithdraw %= FIFTY_NOTES;

            int tenNotes = valueWithdraw / TEN_NOTES;
            valueWithdraw %= TEN_NOTES;

            int fivesNotes = valueWithdraw / FIVE_NOTES;
            valueWithdraw %= FIVE_NOTES;

            int oneReal = valueWithdraw / ONE_REAL;
            System.out.println("Notas de 100 reais: " + notesOfOneHundreds);
            System.out.println("Notas de 50 reais: " + fiftyNotes);
            System.out.println("Notas de 10 reais: " + tenNotes);
            System.out.println("Notas de 5 reais: " + fivesNotes);
            System.out.println("Notas de 1 real: " + oneReal);
        }
    }
}
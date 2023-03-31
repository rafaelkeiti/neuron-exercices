import java.util.Scanner;

public class exercice_21 {

    public static final int MINIMUM_WITHDRAWAL = 10;
    public static final int MAXIMUM_WITHDRAWAL = 600;
    public static final int NOTES_OF_ONE_HUNDREDS = 100;
    public static final int FIFTY_NOTES = 50;
    public static final int TEN_NOTES = 10;
    public static final int FIVE_NOTES = 5;
    public static final int ONE_REAL = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valueWithdraw;
        int notesOfOneHundreds;
        int fiftyNotes;
        int tenNotes;
        int fivesNotes;
        int oneReal;
        System.out.println("Digite quanto deseja sacar:");
        valueWithdraw = input.nextInt();

        if (valueWithdraw < MINIMUM_WITHDRAWAL || valueWithdraw > MAXIMUM_WITHDRAWAL) {
            System.out.println("Digite valores de 10 até 600.");
        } else {
            notesOfOneHundreds = valueWithdraw / NOTES_OF_ONE_HUNDREDS;
            valueWithdraw %= NOTES_OF_ONE_HUNDREDS;

            fiftyNotes = valueWithdraw / FIFTY_NOTES;
            valueWithdraw %= FIFTY_NOTES;

            tenNotes = valueWithdraw / TEN_NOTES;
            valueWithdraw %= TEN_NOTES;

            fivesNotes = valueWithdraw / FIVE_NOTES;
            valueWithdraw %= FIVE_NOTES;

            oneReal = valueWithdraw / ONE_REAL;
            System.out.println("Notas de 100 reais: " + notesOfOneHundreds);
            System.out.println("Notas de 50 reais: " + fiftyNotes);
            System.out.println("Notas de 10 reais: " + tenNotes);
            System.out.println("Notas de 5 reais: " + fivesNotes);
            System.out.println("Notas de 1 real: " + oneReal);
        }
    }
}
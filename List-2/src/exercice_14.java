import java.util.Scanner;

public class exercice_14 {

    public static final int PERFORM_AVERAGE = 2;
    public static final int ZERO = 0;
    public static final int FOUR = 4;
    public static final int SIX = 6;
    public static final double SEVEN_AND_A_HALF = 7.5;
    public static final int NINE = 9;
    public static final int TEN = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNote;
        double secondNote;
        double average;
        String result = "";
        String concept = "";

        System.out.println("Digite a primeira nota:");
        firstNote = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        secondNote = input.nextDouble();

        average = (firstNote + secondNote) / PERFORM_AVERAGE;

        if (average >= ZERO && average <= FOUR) {
            concept = "E";
            result = "REPROVADO";
        } else if (average > FOUR && average < SIX) {
            concept = "D";
            result = "REPROVADO";
        } else if (average >= SIX && average <= SEVEN_AND_A_HALF) {
            concept = "C";
            result = "APROVADO";
        } else if (average > SEVEN_AND_A_HALF && average <= NINE) {
            concept = "B";
            result = "APROVADO";
        } else if (average > NINE && average <= TEN) {
            concept = "A";
            result = "APROVADO";
        } else {
            System.out.println("Ocorreu um erro.");
        }
        System.out.println("Nota 1: " + firstNote +
                "\nNota 2: " + secondNote +
                "\nMédia: " + average +
                "\nConceito: " + concept +
                "\nResultado: " + result);
    }
}

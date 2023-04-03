import java.util.Scanner;

public class exercice_10 {

    private static final String SHIFT_MORNING = "M";
    private static final String SHIFT_AFTERNOON = "V";
    private static final String SHIFT_NIGHT = "N";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o turno que você estuda(M, V, N)");
        String startOfTheShift = input.nextLine();

        if (startOfTheShift.equalsIgnoreCase(SHIFT_MORNING)) {
            System.out.println("Bom Dia!");
        } else if (startOfTheShift.equalsIgnoreCase(SHIFT_AFTERNOON)) {
            System.out.println("Boa Tarde!");
        } else if (startOfTheShift.equalsIgnoreCase(SHIFT_NIGHT)) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}

import java.util.Scanner;

public class exercice_10 {

    public static final String SHIFT_MORNING = "M";
    public static final String SHIFT_AFTERNOON = "V";
    public static final String SHIFT_NIGHT = "N";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String startOfTheShift;

        System.out.println("Digite o turno que você estuda(M, V, N)");
        startOfTheShift = input.nextLine();

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

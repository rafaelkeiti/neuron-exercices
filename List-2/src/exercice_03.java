import java.util.Scanner;

public class exercice_03 {

    private static final String WOMAN_SEX = "F";
    private static final String MALE_SEX = "M";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite (F) para feminino e (M) para masculino:");
        String sex = input.nextLine();

        if (sex.equalsIgnoreCase(WOMAN_SEX)) {
            System.out.println("Sexo Feminino.");
        } else if (sex.equalsIgnoreCase(MALE_SEX)) {
            System.out.println("Sexo Masculino.");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}

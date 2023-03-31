import java.util.Scanner;

public class exercice_03 {

    public static final int MINIMUM_CHARACTERS = 3;
    public static final int ZERO = 0;
    public static final int ONE_HUNDRED_AND_FIFTY = 150;
    public static final String WOMAN_SEX = "F";
    public static final String MALE_SEX = "M";
    public static final String SINGLE = "S";
    public static final String MARRIED = "C";
    public static final String WIDOWER = "V";
    public static final String DIVORCED = "D";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int years;
        double salary;
        String sex;
        String maritalStatus;

        System.out.println("Digite seu nome:");
        name = input.nextLine();

        while (name.length() < MINIMUM_CHARACTERS) {
            System.out.println("Seu Nome deve ter mais de 3 caracteres.");
            System.out.println("Digite novamente seu Nome:");
            name = input.nextLine();
        }

        System.out.println("Digite sua Idade:");
        years = input.nextInt();

        while (years < ZERO || years > ONE_HUNDRED_AND_FIFTY) {
            System.out.println("Sua Idade deve ser entre 0 até 150.");
            System.out.println("Digite novamente sua Idade:");
            years = input.nextInt();
        }
        input.nextLine();

        System.out.println("Digite seu salário:");
        salary = input.nextDouble();

        while (salary < ZERO) {
            System.out.println("Seu Salário deve ser maior que 0.");
            System.out.println("Digite novamente seu Salário:");
            salary = input.nextDouble();
        }
        input.nextLine();

        System.out.println("Digite seu Sexo:");
        sex = input.nextLine();

        while (!(sex.equalsIgnoreCase(WOMAN_SEX) || sex.equalsIgnoreCase(MALE_SEX))) {
            System.out.println("Seu Sexo deve ser: (f ou m).");
            System.out.println("Digite novamente seu Sexo:");
            sex = input.nextLine();
        }

        System.out.println("Digite seu Estado Civil:");
        System.out.println("Escolhe entre esses: (s, c, v OU d)");
        maritalStatus = input.nextLine();

        while (!(maritalStatus.equalsIgnoreCase(SINGLE) || maritalStatus.equalsIgnoreCase(MARRIED) ||
                maritalStatus.equalsIgnoreCase(WIDOWER) || maritalStatus.equalsIgnoreCase(DIVORCED))) {
            System.out.println("Seu Estado Civil deve ser um desses (s, c, v ou d).");
            System.out.println("Digite novamente seu Estado Civil:");
            maritalStatus = input.nextLine();
        }
        System.out.println("Nome: " + name +
                "\nIdade: " + years +
                "\nSalário: " + salary +
                "\nSexo: " + sex +
                "\nEstado Civil: " + maritalStatus);
    }
}

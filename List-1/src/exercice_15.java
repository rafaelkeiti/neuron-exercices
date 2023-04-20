import java.util.Scanner;

public class exercice_15 {

    private static final double INCOME_TAX_PERCENTAGE_DISCOUNT = 0.11;
    private static final double INSS_PERCENTAGE_DISCOUNT = 0.08;
    private static final double SYNDICATE_PERCENTAGE_DISCOUNT = 0.05;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto você recebe por horas trabalhadas?");
        double earningsPerHour = input.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        int workedHours = input.nextInt();

        double salaryTotal = earningsPerHour * workedHours;
        double incomeTax = salaryTotal * INCOME_TAX_PERCENTAGE_DISCOUNT;
        double inss = (salaryTotal - incomeTax) * INSS_PERCENTAGE_DISCOUNT;
        double syndicate = (salaryTotal - inss) * SYNDICATE_PERCENTAGE_DISCOUNT;
        double netSalary = (salaryTotal - incomeTax - inss - syndicate);

        System.out.println("O salário bruto é de: " + salaryTotal +
                "\nO IR foi de: " + incomeTax + "\nINSS: " + inss +
                "\nSindicato: " + syndicate + "\nSalário Líquido: " + netSalary);
    }
}

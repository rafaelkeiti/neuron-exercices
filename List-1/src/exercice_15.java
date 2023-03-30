import java.util.Scanner;

public class exercice_15 {

    public static final double INCOME_TAX_PERCENTAGE_DISCOUNT = 0.11;
    public static final double INSS_PERCENTAGE_DISCOUNT = 0.08;
    public static final double SYNDICATE_PERCENTAGE_DISCOUNT = 0.05;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int workedHours;
        double earningsPerHour;
        double salaryTotal;
        double incomeTax;
        double inss;
        double syndicate;
        double netSalary;

        System.out.println("Quanto você recebe por horas trabalhadas?");
        earningsPerHour = input.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        workedHours = input.nextInt();

        salaryTotal = earningsPerHour * workedHours;
        incomeTax = salaryTotal * INCOME_TAX_PERCENTAGE_DISCOUNT;
        inss = (salaryTotal - incomeTax) * INSS_PERCENTAGE_DISCOUNT;
        syndicate = (salaryTotal - inss) * SYNDICATE_PERCENTAGE_DISCOUNT;
        netSalary = (salaryTotal - incomeTax - inss - syndicate);

        System.out.println("O salário bruto é de: " + salaryTotal +
                "\nO IR foi de: " + incomeTax + "\nINSS: " + inss +
                "\nSindicato: " + syndicate + "\nSalário Líquido: " + netSalary);
    }
}

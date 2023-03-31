import java.util.Scanner;

public class exercice_12 {

    public static final double THREE_PERCENT_DISCOUNT = 0.03;
    public static final double ELEVEN_PERCENT_FGTS = 0.11;
    public static final int ZERO = 0;
    public static final int EXEMPTION_FROM_DISCOUNTS = 900;
    public static final int SALARY_WITH_FIVE_PERCENT_DISCOUNT = 1500;
    public static final int SALARY_WITH_TEN_PERCENT_DISCOUNT = 2500;
    public static final double FIVE_PERCENT_DISCOUNT = 0.05;
    public static final double TEN_PERCENT_DISCOUNT = 0.1;
    public static final double TWENTY_PERCENT_DISCOUNT = 0.2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grossSalary;
        double netSalary;
        double salaryDiscountIR;
        double salaryDiscountSyndicate;
        double salaryDiscountFGTS;
        double totalDiscounts;
        int workedHours;
        int workedDays;

        System.out.println("Digite quanto você ganha por hora:");
        workedHours = input.nextInt();

        System.out.println("Digite quantos dias você trabalhou:");
        workedDays = input.nextInt();

        grossSalary = workedHours * workedDays;
        salaryDiscountSyndicate = grossSalary * THREE_PERCENT_DISCOUNT;
        salaryDiscountFGTS = grossSalary * ELEVEN_PERCENT_FGTS;

        if (grossSalary <= EXEMPTION_FROM_DISCOUNTS) {
            salaryDiscountIR = ZERO;
            salaryDiscountSyndicate = ZERO;
        } else if (grossSalary <= SALARY_WITH_FIVE_PERCENT_DISCOUNT) {
            salaryDiscountIR = grossSalary * FIVE_PERCENT_DISCOUNT;
        } else if (grossSalary <= SALARY_WITH_TEN_PERCENT_DISCOUNT) {
            salaryDiscountIR = grossSalary * TEN_PERCENT_DISCOUNT;
        } else {
            salaryDiscountIR = grossSalary * TWENTY_PERCENT_DISCOUNT;
        }

        totalDiscounts = salaryDiscountIR + salaryDiscountSyndicate;
        netSalary = grossSalary - salaryDiscountIR - salaryDiscountSyndicate;

        System.out.println("Salário Bruto: " + grossSalary +
                "\nIR: " + salaryDiscountIR +
                "\nSindicato: " + salaryDiscountSyndicate +
                "\nFGTS(pago pela empresa): " + salaryDiscountFGTS +
                "\nTotal de Descontos: " + totalDiscounts +
                "\nSalário Líquido: " + netSalary);
    }
}

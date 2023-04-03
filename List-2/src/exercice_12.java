import java.util.Scanner;

public class exercice_12 {

    private static final double THREE_PERCENT_DISCOUNT = 0.03;
    private static final double ELEVEN_PERCENT_FGTS = 0.11;
    private static final int ZERO = 0;
    private static final int EXEMPTION_FROM_DISCOUNTS = 900;
    private static final int SALARY_WITH_FIVE_PERCENT_DISCOUNT = 1500;
    private static final int SALARY_WITH_TEN_PERCENT_DISCOUNT = 2500;
    private static final double FIVE_PERCENT_DISCOUNT = 0.05;
    private static final double TEN_PERCENT_DISCOUNT = 0.1;
    private static final double TWENTY_PERCENT_DISCOUNT = 0.2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salaryDiscountIR;

        System.out.println("Digite quanto você ganha por hora:");
        int workedHours = input.nextInt();

        System.out.println("Digite quantos dias você trabalhou:");
        int workedDays = input.nextInt();

        double grossSalary = workedHours * workedDays;
        double salaryDiscountSyndicate = grossSalary * THREE_PERCENT_DISCOUNT;
        double salaryDiscountFGTS = grossSalary * ELEVEN_PERCENT_FGTS;

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

        double totalDiscounts = salaryDiscountIR + salaryDiscountSyndicate;
        double netSalary = grossSalary - salaryDiscountIR - salaryDiscountSyndicate;

        System.out.println("Salário Bruto: " + grossSalary +
                "\nIR: " + salaryDiscountIR +
                "\nSindicato: " + salaryDiscountSyndicate +
                "\nFGTS(pago pela empresa): " + salaryDiscountFGTS +
                "\nTotal de Descontos: " + totalDiscounts +
                "\nSalário Líquido: " + netSalary);
    }
}

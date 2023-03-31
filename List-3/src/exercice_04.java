public class exercice_04 {

    public static final double THREE_PERCENT_GROWTH = 0.03;
    public static final double ONE_AND_A_HALF_PERCENT_GROWTH = 0.015;

    public static void main(String[] args) {
        int countryA = 80000;
        int countryB = 200000;
        int years = 0;

        while (countryA < countryB) {
            countryA += countryA * THREE_PERCENT_GROWTH;
            countryB += countryB * ONE_AND_A_HALF_PERCENT_GROWTH;
            years++;
        }
        System.out.println("Quantidade de anos para ultrapassar: " + years + "\nPaís A: " + countryA + "\nPaís B: " + countryB);
    }
}

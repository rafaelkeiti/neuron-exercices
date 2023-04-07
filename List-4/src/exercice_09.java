public class exercice_09 {

    private static final int ZERO_START = 0;
    private static final int ADDING_ONE_MORE = 1;

    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        double[] vectorC = new double[10];

        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i;
        }

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = (i + ADDING_ONE_MORE);
        }

        for (int i = ZERO_START; i < vectorC.length; i++) {
            vectorC[i] = (double) vectorA[i] / vectorB[i];
        }

        System.out.print("Vetor A: ");
        for (int j : vectorA) {
            System.out.print(j + " | ");
        }

        System.out.print("\nVetor B: ");
        for (int j : vectorB) {
            System.out.print(j + " | ");
        }

        System.out.print("\nVetor C: ");
        for (double v : vectorC) {
            System.out.printf("%.2f | ", v);
        }
    }
}

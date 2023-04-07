import static java.lang.Math.sqrt;

public class exercice_04 {

    private static final int ZERO_START = 0;

    public static void main(String[] args) {
        int[] vectorA = new int[15];
        double[] vectorB = new double[15];

        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i;
        }

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = sqrt(vectorA[i]);
        }

        System.out.print("Vetor A: ");
        for (int j : vectorA) {
            System.out.print(j + " | ");
        }

        System.out.print("\nVetor B: ");
        for (double v : vectorB) {
            System.out.printf("%.2f | ", v);
        }
    }
}

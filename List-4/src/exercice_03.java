public class exercice_03 {

    private static final int ZERO_START = 0;

    public static void main(String[] args) {
        int[] vectorA = new int[15];
        int[] vectorB = new int[15];

        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i;
        }

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] * vectorA[i];
        }

        System.out.print("Vetor A: ");
        for (int j : vectorA) {
            System.out.print(j + " | ");
        }

        System.out.print("\nVetor B: ");
        for (int j : vectorB) {
            System.out.print(j + " | ");
        }
    }
}

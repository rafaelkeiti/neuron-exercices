public class exercice_02 {

    private static final int ZERO_START = 0;
    private static final int DOUBLE_VECTOR_A = 2;

    public static void main(String[] args) {
        int[] vectorA = new int[8];
        int[] vectorB = new int[8];

        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i;
        }

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] * DOUBLE_VECTOR_A;
        }

        System.out.print("VetorA: ");
        for (int j : vectorA) {
            System.out.print(j + " | ");
        }

        System.out.print("\nVetorB: ");
        for (int j : vectorB) {
            System.out.print(j + " | ");
        }
    }
}

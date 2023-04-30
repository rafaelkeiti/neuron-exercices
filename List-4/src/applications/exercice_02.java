package applications;

import static utils.VectorUtils.*;

public class exercice_02 {
    private static final int DOUBLE_VECTOR_A = 2;

    public static void main(String[] args) {
        int[] vectorA = new int[8];
        int[] vectorB = new int[8];

        generateValuesVector(vectorA);

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] * DOUBLE_VECTOR_A;
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
    }
}

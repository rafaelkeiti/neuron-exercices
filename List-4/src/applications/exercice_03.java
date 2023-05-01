package applications;

import static utils.VectorUtils.*;

public class exercice_03 {

    public static void main(String[] args) {
        final int[] vectorA = new int[15];
        final int[] vectorB = new int[15];

        generateValuesVector(vectorA);

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] * vectorA[i];
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
    }
}

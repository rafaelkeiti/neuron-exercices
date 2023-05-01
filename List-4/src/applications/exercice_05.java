package applications;

import static utils.VectorUtils.*;

public class exercice_05 {

    public static void main(String[] args) {
        final int[] vectorA = new int[10];
        final int[] vectorB = new int[10];

        generateValuesVector(vectorA);

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] * i;
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
    }
}

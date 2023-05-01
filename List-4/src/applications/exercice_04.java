package applications;

import static java.lang.Math.sqrt;
import static utils.VectorUtils.*;

public class exercice_04 {

    public static void main(String[] args) {
        final int[] vectorA = new int[15];
        final double[] vectorB = new double[15];

        generateValuesVector(vectorA);

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = sqrt(vectorA[i]);
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
    }
}

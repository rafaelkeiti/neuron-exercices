package utils;

public class VectorUtils {

    public static final int ZERO_START = 0;

    public static void printVector(String s, int[] vectorA) {
        System.out.print("\n" + s + " - ");
        for (int j : vectorA) {
            System.out.print(j + " | ");
        }
    }

    public static void printVector(String s, double[] vectorB) {
        System.out.print("\n" + s + " - ");
        for (double v : vectorB) {
            System.out.printf("%.2f | ", v);
        }
    }

    public static void printArray(int[][] array) {
        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void generateValuesVector(int[] vectorA) {
        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i;
        }
    }
}
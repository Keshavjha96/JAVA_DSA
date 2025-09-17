package Multidimensionalarrays;

public class minElementofallMAXineachRow {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5, 7},{5, 8, 9, 10},{9, 12, 1, 3}};
        int minOfMax = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length;i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            if (max < minOfMax) {
                minOfMax = max;
            }
        }
        System.out.println("Minimum of all row maximums = " + minOfMax);
    }
}

package Search;

public class MinMaxValue2D {

    public static void main(String[] args) {
        int[][] arr = {
                { 3, 2, 1, 9 },
                { 10, 11, 23, 45 },
                { 34, 45, 56, -78 },
        };

        System.out.println(minValue(arr));
    }

    public static int minValue(int[][] arr) {
        int minValue = arr[0][0];

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                int currentValue = arr[row][col];
                if (currentValue < minValue) {
                    minValue = currentValue;
                }

            }
        }

        return minValue;
    }
}

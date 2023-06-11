package Search;

import java.util.Arrays;

public class LinearSearch2D {

    public static void main(String[] args) {

        int[][] arr = {

                { 1, 3, 4, 5 }, { 4, 6, 7, 8, 9 }, { 1, 3, 6, 7, 8 }
        };
        System.out.println(Arrays.toString(searchItem(arr, 80)));
    }

    public static int[] searchItem(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }

            }
        }
        return new int[] { -1, -1 };

    }
}

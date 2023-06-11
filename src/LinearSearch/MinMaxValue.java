package LinearSearch;

public class MinMaxValue {

    public static void main(String[] args) {

        int[] arr = { 100, 2, 3, 4, 500, 6, 7, 8, 9 };
        System.out.println(intMinValueInRange(arr, 6, 8));

    }

    public static int intMaxValue(int[] arr) {
        int max = arr[0];

        for (int element : arr) {

            if (element > max) {

                max = element;
            }
        }
        return max;

    }

    public static int intMinValue(int[] arr) {
        int min = arr[0];

        for (int element : arr) {

            if (element < min) {

                min = element;
            }
        }
        return min;

    }

    public static int intMinValueInRange(int[] arr, int start, int end) {
        int data = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < data) {
                data = arr[i];
            }

        }
        return data;

    }

}

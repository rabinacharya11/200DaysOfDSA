package Search;

public class MinMaxValue {

    public static void main(String[] args) {

        int[] arr = { 100, 2, 3, 4, 500, 6, 7, 8, 9 };
        System.out.println(intMaxValue(arr));

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

}

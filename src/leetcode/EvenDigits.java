package leetcode;

// Question : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 1245 };
        System.out.println(countTheNumberOfEvenDigits(arr));
    }

    public static int countTheNumberOfEvenDigits(int[] arr) {

        int count = 0;

        for (int number : arr) {

            if (hasEvenDigits(number)) {
                count++;
            }

        }
        return count;
    }

    private static boolean hasEvenDigits(int number) {

        int num = number;
        int noOfDigits = 0;

        while (num > 0) {
            int newNum = num / 10;

            noOfDigits++;
            num = newNum;

        }

        if (noOfDigits % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}

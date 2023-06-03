import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // scanner for user input
        Scanner in = new Scanner(System.in);
// declaring the array
        int[] arr = new int[5]; // arr size => 5
        // taking the input from the user iterating the loop for the size of array
        // using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // using enhanced for loop printing the values of the array

        for (int element : arr) {


            System.out.println(element); // prints the element and breaks the line after done printing
        }

        // printing the values as string
        System.out.println(Arrays.toString(arr));
    }
}
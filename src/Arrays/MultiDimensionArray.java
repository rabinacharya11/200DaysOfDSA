package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = userInput.nextInt();


            }

        }


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }

        // printing using enhanced for loop
        for (int[]  arrList : arr) {

            System.out.println(Arrays.toString(arrList));
        }    }
}
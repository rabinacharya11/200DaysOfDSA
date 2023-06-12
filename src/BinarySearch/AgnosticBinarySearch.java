package BinarySearch;

import org.w3c.dom.ls.LSOutput;

public class AgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = {10, 9, 8,7,6,5,4,3,2,1};

        int target  = 1;

        System.out.println(binarySearch(arr, target));
    }



    public static int binarySearch(int[] arr, int target) {

        int start = 0 ;
        int end  = arr.length -1 ;

        if(arr[start]>arr[end]) {
         return    descendingSearch(arr, target);
        }
        else{

      return  ascendingSearch( arr, target);
        }


    }

    public static int descendingSearch(int arr[], int target) {


        int start = 0 ;
        int end = arr.length-1 ;

        while (start<=end) {

            int mid = start + (end-start)/2 ;

            if(target<arr[mid]) {
                start = mid +1 ;
            }
            else if ( target > arr[mid]) {

                end = mid -1 ;
            }
            else {
                return mid ;

            }

        }
        return -1;
    }

    public static int ascendingSearch(int[] arr, int target) {

        int start =0 ;
        int end = arr.length -1 ;

        while (start<=end ) {

            int mid = start + ( end - start) /2 ;

            if(target < arr[mid]) {
                end = mid -1 ;
            }
            else if (target > arr[mid]) {

            start = mid +1 ;
            } else {
                return mid ;

            }


        }
        return -1;
    }

}




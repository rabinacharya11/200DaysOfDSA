package BinarySearch;

public class BinarySearchDSCE {

    public static void main(String[] args) {
         int[] arr = {9,8,7,6,5,4,3,2,1};
         int target = 6 ;

        System.out.println(binarySearch(arr, target));
    }

    public  static int binarySearch(int[] arr, int target) {

        int start = 0 ;
        int end  = arr.length -1 ;
        while (start<=end) {


            int mid = start + (end- start)/2 ;

            if(target < arr[mid]) {
                start = mid +1 ;

            }
            else if ( target > arr[mid]) {

                end = mid -1 ;
            }
            else {
                return  mid ;
            }


        }

        return -1 ;


    }


}

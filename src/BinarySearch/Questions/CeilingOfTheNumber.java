package BinarySearch.Questions;

public class CeilingOfTheNumber {

    public static void main(String[] args) {

        int[] arr = {11, 23, 44, 45,66, 78, 88, 99 } ;
        int target = 65 ;

        System.out.println(arr[ceilingOfTheNumber(arr, target)]);
    }

    // ceiling of the number means the number that is greater than or equal to the target element
    // eg . int the array of  {11, 23, 44, 45,66, 78, 88, 99 }
    // and target of 67 our ceiling
    // target 66 => 66 ceiling
    static  int ceilingOfTheNumber(int[] arr, int target) {

        int start =  0 ;
        int end = arr.length -1 ;
        while(start<=end) {


            int mid = start + (end - start) /2 ;

            if(target <arr[mid]) {

                end = mid -1 ;

            }
            else if ( target > arr[mid]) {
                start = mid +1 ;
            }
            else {   return mid ;
            }

        }
 // when the loop breaks, the start will be ahead of mid by 1, which means out element didn't lie in the middle of the array
        // we also can  understand that if our element didn't lie in the mid of the array and
        // start became greater than end
        // the next element will be greater than the target element
        return start ;
    }
}

package BinarySearch.Questions;

public class FloorOfTheNumber {


    public static void main(String[] args) {
        int[] arr = {1,23,45,55,65,75,85} ;
        int target = 50 ;

        System.out.println(floorOfTheNumberInArray(arr, target));

    }
     /// Floor of the number means the greater number that is less than or equal to the target number
    /// e.g  :   if the target number is 13
    /// if the number 13 doesn't exist than we will go to look for the largest number  less than 13
    /// let's assume there are 4 different numbers less than 13,  => 8, 9,  11, 12
    /// then the floor of the number will be 12
    static int floorOfTheNumberInArray(int[] arr, int target) {

        int start = 0 ;  // starting position of the arr
        int end = arr.length -1 ;  // end position of the array

        while(start<=end) {  /// the search will happen only if the start element is less than or equal to end

            /// finding the mid of the element

            int mid  = start + ( end -start) /2 ;

            ///  if the target is less than the number at the mid of the element, then we will shift the end by mid-1

            if(target<arr[mid]) {
                end = mid -1 ;
            }
            ///  if the target is greater than the number at the mid of the element, then we will shift the start by mid + 1
            else if ( target > arr[mid]) {

                start = mid +1 ;
            }

            ///  if the target is equal to  the number at the mid of the element, then we will return the index
            else {
                return mid ;
            }
         }
 /// when the loops breaks without returning any element from the loop, here is what will be the outcome

        /// let's assume that we have  arr of  {12, 13, 26, 45, 67}
        /// our target element is 20,
        /// the loop will not find any element in the array, so the loop breaks
        /// when the loop breaks, the start will be shifted 1 times more than the end
        /// the element we will be searching will fall into end , hence we return end
        return end ;

    }
}

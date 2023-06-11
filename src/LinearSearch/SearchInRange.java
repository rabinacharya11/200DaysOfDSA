package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 7, 8, 99, 100, 234, 45, 66, 7, 8, 8, 9};
        int target = 2;
        int end = 5;
        int begin = 0;

        System.out.print(searchInRange(arr, target, end, begin));


    }

    public static boolean searchInRange(int[] arr, int target, int end, int begin) {

        if (arr.length == 0) {
            return false;
        }


        if (end < begin) {

            return false; //here we are return -1 as well but the return type of the current function is boolean
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }





        }
        return  false;
    }
}

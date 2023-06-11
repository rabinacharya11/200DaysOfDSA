package LinearSearch;

// find if 14 exits  of not 14 is in the array or not
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,87,14,45,6,7,8};
        int target = 45 ;
        System.out.println(searchArray(arr, target));

    }


    static boolean searchArray(int[] arr, int target) {

if(arr.length ==0) {

return false ;
}


for(int element : arr) {

if(element == target) {

return true;
}
}
        return false ;
    }

}


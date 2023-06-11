package LinearSearch;

public class SearchInArray {

    public static void main(String[] args) {
        String name = "Rabin Acharya";
        char target = '1';
        System.out.println(searchInArray(name, target));


    }

    public  static boolean searchInArray(String name , char target) {
// if there is an empty name, we return false
        if(name.isEmpty()) {
        return false;
        }
        // if not empty name is passed we will make sure to search everyCharacters that are in the String

        for (int i = 0; i<name.length() ; i++) {

// checking
            if(name.charAt(i) == target) {


            return true ;}
        }

        return false ;

    }
}

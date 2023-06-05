package Search;

public class SearchInArray {

    public static void main(String[] args) {
        String name = "Rabin Acharya";
        char target = '1';
        System.out.println(searchInArray(name, target));


    }

    public  static boolean searchInArray(String name , char target) {

        if(name.isEmpty()) {
        return false;
        }

        for (int i = 0; i<name.length() ; i++) {


            if(name.charAt(i) == target) {


            return true ;}
        }

        return false ;


    }
}

import java .util.*;


public class acreation {
    public static void main(String[] args) {
        // Creation of String 
        char arr [] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String ("abcd");

        // Strings are IMMUTABLE


        Scanner sc = new Scanner (System.in);
        String name ;   //eg  int name ; 
        // name = sc.next();  // Will only Print First word 
        name = sc.nextLine(); // Will print Full string 

        System.out.println(name);
    }
}

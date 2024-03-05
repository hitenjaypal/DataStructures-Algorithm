import java .util.*;


public class acreation {
    public static void main(String[] args) {
        // Creation of String 
        char arr [] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String ("abcd");  // You can Write any Character @$#%

        // Strings are IMMUTABLE


        Scanner sc = new Scanner (System.in);
        String name ;   //eg  int name ; 
        // name = sc.next();  // Will only Print First word 
        name = sc.nextLine(); // Will print Full string 

        System.out.println(name);


        String fullName =  "John Doe" ;
        System.out.println(fullName.length()); //8  // For Finding the Length of String It is similar to array just here is // eExtra () paratheseis  
    }
}

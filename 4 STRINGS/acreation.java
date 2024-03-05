import java .util.*;


public class acreation {

    public static void printletters (String str) {
        for ( int i = 0 ; i < str.length() ; i ++) {
            System.out.print(str.charAt(i) + " "); // Str Method Which will Print all Letter 
        }
         System.out.println();
    }
    public static void main(String[] args) {

        // CREATION OF STRING
        char arr [] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String ("abcd");  // You can Write any Character @$#%
        // Strings are IMMUTABLE


        // INPUT FUNCTION IN STRING // (NEXT || NEXTLINE )
        Scanner sc = new Scanner (System.in);
        String name ;   //eg  int name ; 
        // name = sc.next();  // Will only Print First word 
        name = sc.nextLine(); // Will print Full string 
        System.out.println(name);


        // FINDING LENGTH OF STRING 
        String fullName =  "John Doe" ;
        System.out.println(fullName.length()); //8  // For Finding the Length of String It is similar to array just here is // eExtra () paratheseis 
        

        // CONCATENATION 
        String fn = "Hiten";
        String ln = "Jaypal";
        String fulln = fn + " " + ln ; // Hiten Jaypal 
        // System.out.println("Full Name : "+fulln ); 
        


        // CHAR AT () METHOD 
        // System.out.println(fulln.charAt(1) );  //Will Print Second Letter  // I 
        printletters(fulln);   // Output- > H i t e n   J a y p a l 
    }
}

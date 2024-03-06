
public class eSubString {
    public static String substring(String str, int si, int ei) {

        // logic 1
         String substr = ""; // Created an empty string so that we can paste the required substring in it 
        for (int i = si ; i < ei ; i ++) {
            substr = substr + str.charAt(i);
        }
        return  substr;

        // Logic 2: Using built-in method of String Class
       //return str.substring(si,ei);
    }
    



    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(substring(str, 0, 3)); // o to 3 toh 0,1,2 hi print krega 
    //    System.out.println(str.substring(0,3));
    }
    
}

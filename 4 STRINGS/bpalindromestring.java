public class bpalindromestring {

    public static boolean Panlindrome (String str){ 
        // Loop 
        for (int i = 0; i < str.length()/2 ; i ++) { 
            int n = str.length(); 
            
            //Logic is Apne first or last ko Check kr rahe hai 
            if (str.charAt(i) != str.charAt(n-1-i)) {
                // not palindrome
                return false ; 
            }
        }
        return true ; 

    }


    public static void main(String[] args) {
        String str = "racecar" ; 
        System.out.println(Panlindrome(str)); 
    }

}

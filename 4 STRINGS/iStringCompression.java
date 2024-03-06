// aaabbbbcccccdd --> a3b4c5d2
// we Will Solved This Qn without using SB 

public class iStringCompression {
    public static String compress(String str) {

        // Create New String
        String newStr = ""; // Sb nai use krre toh ese banaya string 

        // outer loop
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // Object banya beacuse Sb nai use krre hai 

            // inner loop
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            // // If abcd there is no extra aplha so it will be added as it is .
            newStr += str.charAt(i);

            // If there is multiple aplha so we will add the number in front of that alpha
            // by count
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbbbcccccdd";
        System.out.println(compress(str));
    }
}


// TC 0(n)
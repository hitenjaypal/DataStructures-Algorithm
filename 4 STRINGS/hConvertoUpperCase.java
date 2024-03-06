// For a given String Convert each the first letter of each word to UpperCase.

public class hConvertoUpperCase {
    public static String toUpperCase(String str) {
        // Create SB
        StringBuilder sb = new StringBuilder("");

        // First ko Upper CAse krdete hai or badme append krdete hai SB mai
        char ch = Character.toUpperCase(str.charAt(0)); // Upper Case kro String ke First Letter ko
        sb.append(ch);

        // Now Loop Chalakr Condition daaldenege ke jb bhi Space aaye use aage bdho i++
        // then Usse Upper case Krdo
        for (int i = 1; i < str.length(); i++) {
            // Condition
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // space ke phele
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // space ke baad direct SB mai
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString(); // jo sb mai store hua usse  convert krdo string mai 

    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(toUpperCase(str));
    }
}

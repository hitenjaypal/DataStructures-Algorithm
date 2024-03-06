// Print Aplhabets From a to b in O(26) TC
// For This We will Use String Builder (Data Sturucture)
// Beacuse If We use Normal String Then The  Time Complexity Will Be O(n^2).
// Because Normal String mai jese string update hogi toh woh waha point higa isiliye TC badhjygi 
// In case SB voh jese update hogu str uspr point nai hoga 
// Beacuse jo apne ne Starting mai banayi thi wahi hi point rahega

// StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters. Like StringBuffer, the StringBuilder class is an alternative to the Java Strings Class, as the Strings class provides an immutable succession of characters

public class gStringBuilder {
    public static void main(String[] args) {
        
    
    // Created String Builder 
    StringBuilder sb = new StringBuilder("");

     for (char ch='a'; ch <='z'; ch++) {
        sb.append(ch);  // add ch at end of string 
     }// abcdefghijklmnopqrstuvwxyz

     // TC O(26)
        System.out.println(sb);
     }
    }
    
